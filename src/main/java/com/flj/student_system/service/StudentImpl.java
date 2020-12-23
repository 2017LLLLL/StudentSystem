package com.flj.student_system.service;

import com.flj.student_system.dao.TAcademyClassMapper;
import com.flj.student_system.dao.TAcademyMapper;
import com.flj.student_system.dao.TClassAndGradeMapper;
import com.flj.student_system.dao.TStudentMapper;
import com.flj.student_system.entity.TStudent;
import com.flj.student_system.entity.dto.StudentDTO;
import com.flj.student_system.entity.form.StudentForm;
import com.flj.student_system.exception.MyException;
import com.flj.student_system.service.interfaces.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentImpl implements StudentService {

    @Autowired
    private TStudentMapper tStudentMapper;

    @Autowired
    private TClassAndGradeMapper tClassAndGradeMapper;

    @Autowired
    private TAcademyMapper tAcademyMapper;

    @Autowired
    private TAcademyClassMapper tAcademyClassMapper;

    @Override
    public List<StudentDTO> getAllStudent() {
        List<TStudent> tStudents = tStudentMapper.selectAllStudent();
        if(tStudents == null || tStudents.size() == 0){
            throw new MyException("查询学生列表数据为空");
        }
        List<StudentDTO> studentDTOList = new ArrayList<>();
        for (TStudent student :tStudents) {
            StudentDTO studentDTO = new StudentDTO();
            // 复制数据
            BeanUtils.copyProperties(student,studentDTO);
            // 获取班级名称
            String className = tClassAndGradeMapper.selectByClassId(student.getClassId());
            studentDTO.setClassName(className);
            // 获取院系名称
            int academyClassId = tAcademyClassMapper.selectByClassId(student.getClassId());
            String academyClassName = tAcademyMapper.selectByAcademyClassId(academyClassId);
            studentDTO.setAcademyName(academyClassName);
            studentDTOList.add(studentDTO);
        }
        return studentDTOList;
    }

    @Override
    public int addStudent(StudentForm studentForm) {
        if(studentForm == null){
            return -1;
        }
        if(studentForm.getStudentNum() == null || studentForm.getClassId() == null || studentForm.getHomeAddress() == null ||
        studentForm.getDormitoryNum() == null || studentForm.getName() == null || studentForm.getPhone() == null ||
        studentForm.getSex() == null ){
            return -2;
        }
        int insertResult = tStudentMapper.insertOneStudent(studentForm);
        return insertResult;
    }

    @Override
    public int changePassword(long num, String oldPassword, String newPassword) {
        // 校验旧密码
        String oldPwdFromDB = tStudentMapper.selectOldPassword(num);
        if(!oldPwdFromDB.equals(oldPassword)){
            new MyException("旧密码校验失败");
        }
        // 修改新密码
        TStudent tStudent = new TStudent();
        tStudent.setPassword(newPassword);
        tStudent.setStudentNum(num);
        int updateResult = tStudentMapper.updateByStudentNumSelective(tStudent);
        if(updateResult != 1){
            new MyException("修改密码失败，请联系管理员查看情况");
        }
        return updateResult;
    }

    @Override
    public TStudent login(Integer peopleId, String password) {
        if(peopleId == null || password == null){
            throw new MyException("账号密码不能为空");
        }
        int exists = tStudentMapper.selectIfOrNotExists(peopleId);
        if(exists != 1){
            throw new MyException("学号对应学生不存在，请检查学号是否有误！");
        }
        TStudent tStudent = selectByStudentNum(peopleId);
        String passwordFromDB = tStudent.getPassword();
        if(!password.equals(passwordFromDB)){
            throw new MyException("学生学号与密码不匹配");
        }
        return tStudent;


    }

    @Override
    public TStudent selectByStudentNum(Integer peopleId) {
        TStudent tStudent = tStudentMapper.selectByStuNum(peopleId);
        if(tStudent == null){
            throw new MyException("学号无对应学生");
        }
        return tStudent;
    }


}

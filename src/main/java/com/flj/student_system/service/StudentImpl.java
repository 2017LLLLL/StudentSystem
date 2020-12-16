package com.flj.student_system.service;

import com.flj.student_system.dao.TStudentMapper;
import com.flj.student_system.entity.TStudent;
import com.flj.student_system.entity.form.StudentForm;
import com.flj.student_system.exception.MyException;
import com.flj.student_system.service.interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImpl implements StudentService {

    @Autowired
    private TStudentMapper tStudentMapper;

    @Override
    public List<TStudent> getAllStudent() {
        return tStudentMapper.selectAllStudent();
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


}

package com.flj.student_system.service;

import com.flj.student_system.dao.TAcademyMapper;
import com.flj.student_system.dao.TTeacherMapper;
import com.flj.student_system.entity.TTeacher;
import com.flj.student_system.entity.dto.TeacherDTO;
import com.flj.student_system.entity.form.TeacherForm;
import com.flj.student_system.exception.MyException;
import com.flj.student_system.service.interfaces.TeacherService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherImpl implements TeacherService {

    @Autowired
    private TTeacherMapper tTeacherMapper;

    @Autowired
    private TAcademyMapper tAcademyMapper;

    @Override
    public List<TeacherDTO> getAllTeacher() {
        List<TTeacher> tTeachers = tTeacherMapper.selectAllTeacher();
        List<TeacherDTO> teacherDTOList = new ArrayList<>();
        if(tTeachers == null || tTeachers.size() == 0){
            throw new MyException("查询教师列表为空");
        }
        for (TTeacher tTeacher:tTeachers) {
            TeacherDTO teacherDTO = new TeacherDTO();
            BeanUtils.copyProperties(tTeacher,teacherDTO);
            String academyName = tAcademyMapper.selectByAcademyClassId(tTeacher.getAcademyId());
            teacherDTO.setAcademyName(academyName);
            teacherDTOList.add(teacherDTO);
        }
        return teacherDTOList;
    }

    @Override
    public int insertOneTeacher(TeacherForm teacherForm) {
        if(teacherForm == null){
            return -1;
        }
        if(teacherForm.getTeacherName() == null || teacherForm.getTeacherId() == null ||
         teacherForm.getPhone() == null || teacherForm.getAcademyId() == null){
            return -2;
        }
        int insertResult = tTeacherMapper.insertOneTeacher(teacherForm);
        return insertResult;
    }

    @Override
    public int changePassword(int num, String oldPassword, String newPassword) {
        // 校验旧密码
        String oldPwdFromDB = tTeacherMapper.selectOldPassword(num);
        if(!oldPwdFromDB.equals(oldPassword)){
            new MyException("旧密码校验失败");
        }
        // 修改新密码
        TTeacher tTeacher = new TTeacher();
        tTeacher.setTeacherId(num);
        tTeacher.setPassword(newPassword);
        int updateResult = tTeacherMapper.updateByTeacherIdSelective(tTeacher);
        if(updateResult != 1){
            new MyException("修改密码失败，请联系管理员查看情况");
        }
        return updateResult;
    }

    @Override
    public void login(Integer peopleId, String password) {
        if(peopleId == null || password == null){
            throw new MyException("账号密码不能为空");
        }
        int exists = tTeacherMapper.selectIfOrNotExists(peopleId);
        if(exists != 1){
            throw new MyException("工号对应教师不存在，请检查学号是否有误！");
        }
        int checkResult = tTeacherMapper.selectCheckPassword(peopleId, password);
        if(checkResult != 1){
            throw new MyException("账号密码不匹配，请检查密码是否有误！");
        }
    }


}

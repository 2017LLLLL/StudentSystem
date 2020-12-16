package com.flj.student_system.service;

import com.flj.student_system.dao.TTeacherMapper;
import com.flj.student_system.entity.TTeacher;
import com.flj.student_system.entity.form.TeacherForm;
import com.flj.student_system.exception.MyException;
import com.flj.student_system.service.interfaces.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherImpl implements TeacherService {

    @Autowired
    private TTeacherMapper tTeacherMapper;

    @Override
    public List<TTeacher> getAllTeacher() {
        return tTeacherMapper.selectAllTeacher();
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


}

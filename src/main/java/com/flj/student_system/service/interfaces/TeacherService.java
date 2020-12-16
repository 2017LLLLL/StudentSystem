package com.flj.student_system.service.interfaces;

import com.flj.student_system.entity.TTeacher;
import com.flj.student_system.entity.form.TeacherForm;

import java.util.List;

public interface TeacherService {

    /*
    * 获取所有教师信息
    * */
    List<TTeacher> getAllTeacher();

    /*
    * 新增教师
    * */
    int insertOneTeacher(TeacherForm teacherForm);

    /*
     * 修改密码
     * */
    int changePassword(int num,String oldPassword,String newPassword);
}

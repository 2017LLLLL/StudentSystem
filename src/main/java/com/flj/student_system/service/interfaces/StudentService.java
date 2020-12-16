package com.flj.student_system.service.interfaces;

import com.flj.student_system.entity.TStudent;
import com.flj.student_system.entity.form.StudentForm;

import java.util.List;


public interface StudentService {

    /*
    * 查询所有学生
    * */
    List<TStudent> getAllStudent();

    /*
    * 新增学生
    * */
    int addStudent(StudentForm studentForm);


    /*
    * 修改密码
    * */
    int changePassword(long num,String oldPassword,String newPassword);
}

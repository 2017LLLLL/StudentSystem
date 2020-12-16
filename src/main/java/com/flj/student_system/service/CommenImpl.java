package com.flj.student_system.service;

import com.flj.student_system.enums.PeopleCodeEnum;
import com.flj.student_system.service.interfaces.CommenService;
import com.flj.student_system.service.interfaces.StudentService;
import com.flj.student_system.service.interfaces.TeacherService;
import com.flj.student_system.util.TypeCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommenImpl implements CommenService {

    @Autowired
    private StudentService studentService;

    @Autowired
    private TeacherService teacherService;


    @Override
    public int updatePassword(int num, String oldPassword, String newPassword) {
        int ResultCode;
        if (TypeCheck.peopleTypeCheck(num) == PeopleCodeEnum.TEACHER_CODE.getCode()) {
            ResultCode = teacherService.changePassword(num, oldPassword, newPassword);
        } else {
            ResultCode = studentService.changePassword(num, oldPassword, newPassword);
        }
        return ResultCode;
    }
}

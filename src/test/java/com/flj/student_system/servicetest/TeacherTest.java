package com.flj.student_system.servicetest;

import com.flj.student_system.entity.TTeacher;
import com.flj.student_system.service.interfaces.TeacherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TeacherTest {

    @Autowired
    private TeacherService teacherService;

    @Test
    public void testSelectAll(){
        List<TTeacher> allStudent = teacherService.getAllTeacher();
        for (int i = 0; i < allStudent.size(); i++) {
            System.out.println(allStudent.get(i));
        }
    }


}

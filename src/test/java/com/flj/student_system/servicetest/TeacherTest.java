package com.flj.student_system.servicetest;

import com.flj.student_system.service.interfaces.TeacherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TeacherTest {

    @Autowired
    private TeacherService teacherService;

    @Test
    public void testSelectAll(){
    }


}

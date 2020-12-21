package com.flj.student_system.servicetest;

import com.flj.student_system.service.interfaces.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void testSelectAll(){

    }


}

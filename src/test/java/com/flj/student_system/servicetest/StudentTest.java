package com.flj.student_system.servicetest;

import com.flj.student_system.entity.TStudent;
import com.flj.student_system.service.interfaces.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StudentTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void testSelectAll(){
        List<TStudent> allStudent = studentService.getAllStudent();
        for (int i = 0; i < allStudent.size(); i++) {
            System.out.println(allStudent.get(i));
        }
    }


}

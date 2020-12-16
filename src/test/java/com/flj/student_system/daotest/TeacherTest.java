package com.flj.student_system.daotest;

import com.flj.student_system.dao.TTeacherMapper;
import com.flj.student_system.entity.TTeacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TeacherTest {
    @Autowired
    private TTeacherMapper teacherMapper;

    @Test
    public void testSelectAll(){
        List<TTeacher> teachers = teacherMapper.selectAllTeacher();
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i));
        }
    }


}

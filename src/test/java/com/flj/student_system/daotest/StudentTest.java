package com.flj.student_system.daotest;

import com.flj.student_system.dao.TStudentMapper;
import com.flj.student_system.entity.TStudent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StudentTest {

    @Autowired
    private TStudentMapper studentMapper;

    @Test
    public void testSelect(){
        TStudent student = studentMapper.selectByPrimaryKey(1);
        System.out.println(student);
    }

    @Test
    public void testSelectAll(){
        List<TStudent> list = studentMapper.selectAllStudent();
        for (TStudent s: list) {
            System.out.println(s);
        }
    }

    @Test
    public void testInsert(){
        TStudent student = new TStudent();
        student.setClassId(1);
        student.setPassword("1456");
        student.setStudentNum(201700402013L);
        student.setDormitoryNum(109);
        student.setPhone(15296552412L);
        student.setName("测试名字");
        student.setSex(Byte.parseByte("1"));
        student.setHomeAddress("广州白云区");
        studentMapper.insertSelective(student);
    }

}

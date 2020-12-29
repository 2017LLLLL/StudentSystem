package com.flj.student_system.servicetest;

import com.flj.student_system.entity.dto.RoleMenuDTO;
import com.flj.student_system.service.interfaces.RoleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class RoleTest {

    @Autowired
    private RoleService roleService;

    @Test
    public void Test(){
        RoleMenuDTO menuInfo = roleService.getMenuInfo(1);
        System.out.println(menuInfo);
    }

    @Test
    public void Test2(){
        Date date = new Date();
        Date date2 = new Date();
        System.out.println(date);
    }
}

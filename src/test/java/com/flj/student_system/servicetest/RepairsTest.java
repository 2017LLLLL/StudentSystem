package com.flj.student_system.servicetest;

import com.flj.student_system.entity.TRepairs;
import com.flj.student_system.service.interfaces.ReparisService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class RepairsTest {

    @Autowired
    private ReparisService reparisService;


    @Test
    public void selectAll(){
        List<TRepairs> allReparis = reparisService.getAllReparis();
        for (int i = 0; i < allReparis.size(); i++) {
            System.out.println(allReparis.get(i));
        }
    }
}

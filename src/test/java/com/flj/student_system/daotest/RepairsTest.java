package com.flj.student_system.daotest;

import com.flj.student_system.dao.TRepairsMapper;
import com.flj.student_system.entity.TRepairs;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class RepairsTest {

    @Autowired
    private TRepairsMapper repairsMapper;

    @Test
    public void getAllRepairs(){
        List<TRepairs> repairs = repairsMapper.selectAllRepairs();
        for (int i = 0; i < repairs.size(); i++) {
            System.out.println(repairs.get(i));
        }
    }

}

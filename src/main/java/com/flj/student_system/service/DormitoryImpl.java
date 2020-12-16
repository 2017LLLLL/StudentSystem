package com.flj.student_system.service;

import com.flj.student_system.dao.TDormitoryMapper;
import com.flj.student_system.entity.TDormitory;
import com.flj.student_system.service.interfaces.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DormitoryImpl implements DormitoryService {

    @Autowired
    private TDormitoryMapper tDormitoryMapper;

    @Override
    public List<TDormitory> selectAllDormitory() {
        return tDormitoryMapper.selectAllDormitory();
    }
}

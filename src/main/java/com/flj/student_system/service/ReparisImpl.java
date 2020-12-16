package com.flj.student_system.service;

import com.flj.student_system.dao.TRepairsMapper;
import com.flj.student_system.entity.TRepairs;
import com.flj.student_system.entity.form.RepairsForm;
import com.flj.student_system.service.interfaces.ReparisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReparisImpl implements ReparisService {

    @Autowired
    private TRepairsMapper tRepairsMapper;

    @Override
    public List<TRepairs> getAllReparis() {
        return tRepairsMapper.selectAllRepairs();
    }

    @Override
    public int addReparis(RepairsForm repairsForm) {
        if(repairsForm == null){
            return -1;
        }
        if(repairsForm.getDormitoryNum() == null || repairsForm.getRepairsTime() == null || repairsForm.getProblem() == null){
            return -2;
        }
        int insertResult = tRepairsMapper.insertOneRepairs(repairsForm);
        return insertResult;
    }


    @Override
    public int changeStateReparis(TRepairs tRepairs) {
        if(tRepairs == null){
            return -1;
        }
        if(tRepairs.getId() == null || tRepairs.getState() == null){
            return -2;
        }
        int updateResult = tRepairsMapper.updateByPrimaryKeySelective(tRepairs);
        return updateResult;
    }
}

package com.flj.student_system.service;

import com.flj.student_system.dao.TRepairsMapper;
import com.flj.student_system.entity.TRepairs;
import com.flj.student_system.entity.dto.ReparisCountDTO;
import com.flj.student_system.entity.dto.ReparisStateDTO;
import com.flj.student_system.entity.form.RepairsForm;
import com.flj.student_system.exception.MyException;
import com.flj.student_system.service.interfaces.ReparisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
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
        if(repairsForm.getDormitoryNum() == null || repairsForm.getProblem() == null){
            return -2;
        }
        repairsForm.setRepairsTime(new Date());
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


    @Override
    public int selectAllCount() {
        return tRepairsMapper.selectCountRepairs();
    }

    @Override
    public int selectAllFinishCount() {
        return tRepairsMapper.selectCountFinishRepairs();
    }

    @Override
    public int selectAllNotFinishCount() {
        return tRepairsMapper.selectCountNotFinishRepairs();
    }

    @Override
    public ReparisCountDTO selectAllType() {
        ReparisCountDTO reparisCountDTO = new ReparisCountDTO();
        reparisCountDTO.setAllReparis(selectAllCount());
        reparisCountDTO.setFinishReparis(selectAllFinishCount());
        reparisCountDTO.setNotFinishReparis(selectAllNotFinishCount());
        return reparisCountDTO;
    }

    @Override
    public List<ReparisStateDTO> selectGroupsType() {
        List<Integer> listType = tRepairsMapper.selectStateAll();
        List<ReparisStateDTO> reparisStateDTOList = new ArrayList<>();
        for (Integer integer : listType) {
            ReparisStateDTO reparisStateDTO = new ReparisStateDTO();
            reparisStateDTO.setState(integer);
            if(integer.equals(0) || integer == 0){
                reparisStateDTO.setTitle("待处理");
            }else if(integer.equals(1) || integer == 1){
                reparisStateDTO.setTitle("处理完成");
            }else{
                reparisStateDTO.setTitle("已取消");
            }
            reparisStateDTOList.add(reparisStateDTO);
        }
        return reparisStateDTOList;
    }


    @Override
    public List<TRepairs> getAllReparisByDormitory(Integer dormitoryNum) {
        List<TRepairs> tRepairs = tRepairsMapper.selectByDormitoryNum(dormitoryNum);
        if(tRepairs == null || tRepairs.size() ==0){
            throw new MyException("该宿舍目前无工单信息");
        }
        return tRepairs;
    }


}

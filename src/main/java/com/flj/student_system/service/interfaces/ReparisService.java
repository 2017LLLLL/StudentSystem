package com.flj.student_system.service.interfaces;

import com.flj.student_system.entity.TRepairs;
import com.flj.student_system.entity.form.RepairsForm;

import java.util.List;

public interface ReparisService {

    /*
    * 获取所有维修工单信息
    * */
    List<TRepairs> getAllReparis();

    /*
    * 新增维修工单
    * */
    int addReparis(RepairsForm repairsForm);

    /*
    * 更改工单状态
    * */
    int changeStateReparis(TRepairs tRepairs);

    /*
    * 查询所有工单数
    * */
    int selectAllCount();

    /*
     * 查询所有已完成工单数
     * */
    int selectAllFinishCount();

    /*
     * 查询所有未完成工单数
     * */
    int selectAllNotFinishCount();

}

package com.flj.student_system.service.interfaces;

import com.flj.student_system.entity.TRepairs;
import com.flj.student_system.entity.dto.ReparisCountDTO;
import com.flj.student_system.entity.dto.ReparisStateDTO;
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
    int selectAllCount(Integer dormitoryNum);

    /*
     * 查询所有已完成工单数
     * */
    int selectAllFinishCount(Integer dormitoryNum);

    /*
     * 查询所有未完成工单数
     * */
    int selectAllNotFinishCount(Integer dormitoryNum);

    /*
     * 查询所有未完成工单数
     * */
    int selectEvelFinishCount(Integer dormitoryNum);


    /*
    * 查询所有类型的总数
    * */
    ReparisCountDTO selectAllType(Integer dormitoryNum);

   /*
   * 查询每种状态的标识码
   * */
    List<ReparisStateDTO> selectGroupsType();

    /*
     * 通过宿舍号获取所有维修工单信息
     * */
    List<TRepairs> getAllReparisByDormitory(Integer dormitoryNum);

    /*
    * 根据宿舍或者工单状态查询
    * */
    List<TRepairs> getAllReparisByDormitoryOrState(Integer dormitoryNum, Integer state);

    /*
    * 评价工单
    * */
    void evaluateReparis(TRepairs tRepairs);

    /*
    * 删除工单
    * */
    void deleteRepairs(Integer id);

    /*
    * 修改工单信息
    * */
    void updateInfo(TRepairs tRepairs);

    /*
    *
    * */
    List<ReparisStateDTO> selectAllCountByStudent(Integer dormitoryNum);
}

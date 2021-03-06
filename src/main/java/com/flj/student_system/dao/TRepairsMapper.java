package com.flj.student_system.dao;

import com.flj.student_system.entity.TRepairs;
import com.flj.student_system.entity.form.RepairsForm;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TRepairsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repairs
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repairs
     *
     * @mbg.generated
     */
    int insert(TRepairs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repairs
     *
     * @mbg.generated
     */
    int insertSelective(TRepairs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repairs
     *
     * @mbg.generated
     */
    TRepairs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repairs
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TRepairs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repairs
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TRepairs record);


    /*
     * 查询所有维修工单
     * */
    List<TRepairs> selectAllRepairs(@Param("dormitoryNum") Integer dormitoryNum,@Param("state") Integer state);

    /*
    * 新增工单
    * */
    int insertOneRepairs(RepairsForm repairsForm);

    /*
    * 查询工单总数
    * */
    int selectCountRepairs(@Param("dormitoryNum") Integer dormitoryNum);

    /*
    * 查询已完成工单总数
    * */
    int selectCountFinishRepairs(@Param("dormitoryNum") Integer dormitoryNum);


    /*
    * 查询未完成工单总数
    * */
    int selectCountNotFinishRepairs(@Param("dormitoryNum") Integer dormitoryNum);

    /*
    * 查询已评价的工单总数
    * */
    int selectCountEveluRepairs(@Param("dormitoryNum") Integer dormitoryNum);

    /*
    * 查看工单状态总数
    * */
    List<Integer> selectStateAll();

    /*
    * 根据宿舍号查询工单
    * */
    List<TRepairs> selectByDormitoryNum(Integer dormitoryNum);
}
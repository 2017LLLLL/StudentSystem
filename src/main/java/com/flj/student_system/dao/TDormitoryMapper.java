package com.flj.student_system.dao;

import com.flj.student_system.entity.TDormitory;

import java.util.List;

public interface TDormitoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dormitory
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dormitory
     *
     * @mbg.generated
     */
    int insert(TDormitory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dormitory
     *
     * @mbg.generated
     */
    int insertSelective(TDormitory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dormitory
     *
     * @mbg.generated
     */
    TDormitory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dormitory
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TDormitory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dormitory
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TDormitory record);

    /*
    * 查询所有宿舍信息
    * */
    List<TDormitory> selectAllDormitory();
}
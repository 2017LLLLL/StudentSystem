package com.flj.student_system.dao;

import com.flj.student_system.entity.TAcademyClass;

public interface TAcademyClassMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_academy_class
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_academy_class
     *
     * @mbg.generated
     */
    int insert(TAcademyClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_academy_class
     *
     * @mbg.generated
     */
    int insertSelective(TAcademyClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_academy_class
     *
     * @mbg.generated
     */
    TAcademyClass selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_academy_class
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TAcademyClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_academy_class
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TAcademyClass record);
}
package com.flj.student_system.dao;

import com.flj.student_system.entity.TTeacher;
import com.flj.student_system.entity.form.TeacherForm;

import java.util.List;

public interface TTeacherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated
     */
    int insert(TTeacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated
     */
    int insertSelective(TTeacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated
     */
    TTeacher selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TTeacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TTeacher record);

    /*
     * 查询所有教师
     * */
    List<TTeacher> selectAllTeacher();

    /*
    * 新增一个教师
    * */
    int insertOneTeacher(TeacherForm teacherForm);

    /*
     * 查询旧密码
     * */
    String selectOldPassword(long teacherId);

    /*
     * 根据学号修改信息
     * */
    int updateByTeacherIdSelective(TTeacher tTeacher);
}
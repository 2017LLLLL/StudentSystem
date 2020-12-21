package com.flj.student_system.dao;

import com.flj.student_system.entity.TRoleRouter;

import java.util.List;

public interface TRoleRouterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_router
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_router
     *
     * @mbg.generated
     */
    int insert(TRoleRouter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_router
     *
     * @mbg.generated
     */
    int insertSelective(TRoleRouter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_router
     *
     * @mbg.generated
     */
    TRoleRouter selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_router
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TRoleRouter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_router
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TRoleRouter record);

    /*
    * 根据角色ID查询路由
    * */
    List<TRoleRouter> selectByRoleId(Integer roleId);
}
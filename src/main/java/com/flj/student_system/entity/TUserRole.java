package com.flj.student_system.entity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_user_role
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class TUserRole {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_role.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_role.user_num
     *
     * @mbg.generated
     */
    private Integer userNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_role.role_id
     *
     * @mbg.generated
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_role.mark
     *
     * @mbg.generated
     */
    private byte[] mark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_role.id
     *
     * @return the value of t_user_role.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_role.id
     *
     * @param id the value for t_user_role.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_role.user_num
     *
     * @return the value of t_user_role.user_num
     *
     * @mbg.generated
     */
    public Integer getUserNum() {
        return userNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_role.user_num
     *
     * @param userNum the value for t_user_role.user_num
     *
     * @mbg.generated
     */
    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_role.role_id
     *
     * @return the value of t_user_role.role_id
     *
     * @mbg.generated
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_role.role_id
     *
     * @param roleId the value for t_user_role.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_role.mark
     *
     * @return the value of t_user_role.mark
     *
     * @mbg.generated
     */
    public byte[] getMark() {
        return mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_role.mark
     *
     * @param mark the value for t_user_role.mark
     *
     * @mbg.generated
     */
    public void setMark(byte[] mark) {
        this.mark = mark;
    }
}
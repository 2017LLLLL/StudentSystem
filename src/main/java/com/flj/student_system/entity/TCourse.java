package com.flj.student_system.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_course
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class TCourse {

    @ApiModelProperty(value = "主键id")
    private Integer id;

    @ApiModelProperty(value = "课程编号")
    private Integer courseId;

    @ApiModelProperty(value = "课程名称")
    private String courseName;

    @ApiModelProperty(value = "任课教师Id")
    private Integer teacherNum;

    @ApiModelProperty(value = "备注")
    private String mark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_course.id
     *
     * @return the value of t_course.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_course.id
     *
     * @param id the value for t_course.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_course.course_id
     *
     * @return the value of t_course.course_id
     *
     * @mbg.generated
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_course.course_id
     *
     * @param courseId the value for t_course.course_id
     *
     * @mbg.generated
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_course.course_name
     *
     * @return the value of t_course.course_name
     *
     * @mbg.generated
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_course.course_name
     *
     * @param courseName the value for t_course.course_name
     *
     * @mbg.generated
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_course.teacher_num
     *
     * @return the value of t_course.teacher_num
     *
     * @mbg.generated
     */
    public Integer getTeacherNum() {
        return teacherNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_course.teacher_num
     *
     * @param teacherNum the value for t_course.teacher_num
     *
     * @mbg.generated
     */
    public void setTeacherNum(Integer teacherNum) {
        this.teacherNum = teacherNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_course.mark
     *
     * @return the value of t_course.mark
     *
     * @mbg.generated
     */
    public String getMark() {
        return mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_course.mark
     *
     * @param mark the value for t_course.mark
     *
     * @mbg.generated
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "TCourse{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", teacherNum=" + teacherNum +
                ", mark='" + mark + '\'' +
                '}';
    }
}
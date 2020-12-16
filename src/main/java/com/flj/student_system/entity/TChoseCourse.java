package com.flj.student_system.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_chose_course
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class TChoseCourse {

    @ApiModelProperty(value = "主键id")
    private Integer id;

    @ApiModelProperty(value = "课程id号")
    private Integer courseId;

    @ApiModelProperty(value = "分数")
    private Long score;

    @ApiModelProperty(value = "学生学号")
    private Long studentNum;

    @ApiModelProperty(value = "备注")
    private String mark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chose_course.id
     *
     * @return the value of t_chose_course.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chose_course.id
     *
     * @param id the value for t_chose_course.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chose_course.course_id
     *
     * @return the value of t_chose_course.course_id
     *
     * @mbg.generated
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chose_course.course_id
     *
     * @param courseId the value for t_chose_course.course_id
     *
     * @mbg.generated
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chose_course.score
     *
     * @return the value of t_chose_course.score
     *
     * @mbg.generated
     */
    public Long getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chose_course.score
     *
     * @param score the value for t_chose_course.score
     *
     * @mbg.generated
     */
    public void setScore(Long score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chose_course.student_num
     *
     * @return the value of t_chose_course.student_num
     *
     * @mbg.generated
     */
    public Long getStudentNum() {
        return studentNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chose_course.student_num
     *
     * @param studentNum the value for t_chose_course.student_num
     *
     * @mbg.generated
     */
    public void setStudentNum(Long studentNum) {
        this.studentNum = studentNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chose_course.mark
     *
     * @return the value of t_chose_course.mark
     *
     * @mbg.generated
     */
    public String getMark() {
        return mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chose_course.mark
     *
     * @param mark the value for t_chose_course.mark
     *
     * @mbg.generated
     */
    public void setMark(String mark) {
        this.mark = mark;
    }
}
package com.flj.student_system.entity.form;

import io.swagger.annotations.ApiModelProperty;

public class CourseForm {


    @ApiModelProperty(value = "课程编号")
    private Integer courseId;

    @ApiModelProperty(value = "课程名称")
    private String courseName;

    @ApiModelProperty(value = "任课教师Id")
    private Integer teacherNum;

    @ApiModelProperty(value = "备注")
    private String mark;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getTeacherNum() {
        return teacherNum;
    }

    public void setTeacherNum(Integer teacherNum) {
        this.teacherNum = teacherNum;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public CourseForm() {
    }

    public CourseForm(Integer courseId, String courseName, Integer teacherNum, String mark) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacherNum = teacherNum;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "CourseForm{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", teacherNum=" + teacherNum +
                ", mark='" + mark + '\'' +
                '}';
    }
}

package com.flj.student_system.entity.dto;

import io.swagger.annotations.ApiModelProperty;

public class CourseDTO {

    @ApiModelProperty(value = "课程编号")
    private Integer courseId;

    @ApiModelProperty(value = "开课周")
    private Integer startWeek;

    @ApiModelProperty(value = "持续多少周")
    private Integer lastTimeWeek;

    @ApiModelProperty(value = "课程名称")
    private String courseName;

    @ApiModelProperty(value = "任课教师名称")
    private String teacherName;

    @ApiModelProperty(value = "备注")
    private String mark;

    public Integer getStartWeek() {
        return startWeek;
    }

    public void setStartWeek(Integer startWeek) {
        this.startWeek = startWeek;
    }

    public Integer getLastTimeWeek() {
        return lastTimeWeek;
    }

    public void setLastTimeWeek(Integer lastTimeWeek) {
        this.lastTimeWeek = lastTimeWeek;
    }

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

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}

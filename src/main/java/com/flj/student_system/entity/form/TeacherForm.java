package com.flj.student_system.entity.form;

import io.swagger.annotations.ApiModelProperty;

public class TeacherForm {

    @ApiModelProperty(value = "教师工号")
    private Integer teacherId;

    @ApiModelProperty(value = "教师姓名")
    private String teacherName;

    @ApiModelProperty(value = "学院id")
    private Integer academyId;

    @ApiModelProperty(value = "联系方式")
    private Long phone;

    @ApiModelProperty(value = "备注")
    private String mark;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getAcademyId() {
        return academyId;
    }

    public void setAcademyId(Integer academyId) {
        this.academyId = academyId;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public TeacherForm(Integer teacherId, String teacherName, Integer academyId, Long phone, String mark) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.academyId = academyId;
        this.phone = phone;
        this.mark = mark;
    }

    public TeacherForm() {
    }

    @Override
    public String toString() {
        return "TeacherForm{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", academyId=" + academyId +
                ", phone=" + phone +
                ", mark='" + mark + '\'' +
                '}';
    }
}

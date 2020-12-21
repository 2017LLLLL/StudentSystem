package com.flj.student_system.entity.dto;

import io.swagger.annotations.ApiModelProperty;

public class StudentDTO {

    @ApiModelProperty(value = "主键id")
    private Integer id;


    @ApiModelProperty(value = "学号")
    private Long studentNum;


    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "性别")
    private Byte sex;

    @ApiModelProperty(value = "家庭住址")
    private String homeAddress;

    @ApiModelProperty(value = "宿舍号")
    private Integer dormitoryNum;

    @ApiModelProperty(value = "班级")
    private Integer classId;

    private String className;

    private String academyName;

    @ApiModelProperty(value = "联系电话")
    private Long phone;

    @ApiModelProperty(value = "备注")
    private String mark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Long studentNum) {
        this.studentNum = studentNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Integer getDormitoryNum() {
        return dormitoryNum;
    }

    public void setDormitoryNum(Integer dormitoryNum) {
        this.dormitoryNum = dormitoryNum;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAcademyName() {
        return academyName;
    }

    public void setAcademyName(String academyName) {
        this.academyName = academyName;
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
}

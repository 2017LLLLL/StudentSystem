package com.flj.student_system.entity.form;

import io.swagger.annotations.ApiModelProperty;

public class StudentForm {

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

    @ApiModelProperty(value = "联系电话")
    private Long phone;

    @ApiModelProperty(value = "备注")
    private String mark;

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

    public StudentForm(Long studentNum, String name, Byte sex, String homeAddress, Integer dormitoryNum, Integer classId, Long phone, String mark) {
        this.studentNum = studentNum;
        this.name = name;
        this.sex = sex;
        this.homeAddress = homeAddress;
        this.dormitoryNum = dormitoryNum;
        this.classId = classId;
        this.phone = phone;
        this.mark = mark;
    }

    public StudentForm() {
    }

    @Override
    public String toString() {
        return "StudentForm{" +
                "studentNum=" + studentNum +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", homeAddress='" + homeAddress + '\'' +
                ", dormitoryNum=" + dormitoryNum +
                ", classId=" + classId +
                ", phone=" + phone +
                ", mark='" + mark + '\'' +
                '}';
    }
}

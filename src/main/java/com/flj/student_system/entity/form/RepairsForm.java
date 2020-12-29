package com.flj.student_system.entity.form;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class RepairsForm {



    @ApiModelProperty(value = "宿舍号")
    private Integer dormitoryNum;

    @ApiModelProperty(value = "报修时间")
    private Date repairsTime;

    @ApiModelProperty(value = "报修问题")
    private String problem;



    @ApiModelProperty(value = "备注")
    private String mark;

    public Integer getDormitoryNum() {
        return dormitoryNum;
    }

    public void setDormitoryNum(Integer dormitoryNum) {
        this.dormitoryNum = dormitoryNum;
    }

    public Date getRepairsTime() {
        return repairsTime;
    }

    public void setRepairsTime(Date repairsTime) {
        this.repairsTime = repairsTime;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public RepairsForm() {
    }

    public RepairsForm(Integer dormitoryNum, Date repairsTime, String problem, String mark) {
        this.dormitoryNum = dormitoryNum;
        this.repairsTime = repairsTime;
        this.problem = problem;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "RepairsForm{" +
                "dormitoryNum=" + dormitoryNum +
                ", repairsTime=" + repairsTime +
                ", problem='" + problem + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}

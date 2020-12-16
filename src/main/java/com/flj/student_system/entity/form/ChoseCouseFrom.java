package com.flj.student_system.entity.form;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class ChoseCouseFrom {

    @ApiModelProperty(value = "课程id号")
    private Integer courseId;

    @ApiModelProperty(value = "分数")
    private BigDecimal score;

    @ApiModelProperty(value = "学生学号")
    private Long studentNum;

    @ApiModelProperty(value = "备注")
    private String mark;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Long getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Long studentNum) {
        this.studentNum = studentNum;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public ChoseCouseFrom(Integer courseId, BigDecimal score, Long studentNum, String mark) {
        this.courseId = courseId;
        this.score = score;
        this.studentNum = studentNum;
        this.mark = mark;
    }

    public ChoseCouseFrom() {
    }

    @Override
    public String toString() {
        return "ChoseCouseFrom{" +
                "courseId=" + courseId +
                ", score=" + score +
                ", studentNum=" + studentNum +
                ", mark='" + mark + '\'' +
                '}';
    }
}

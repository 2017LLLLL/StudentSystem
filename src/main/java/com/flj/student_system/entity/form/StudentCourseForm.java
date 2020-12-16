package com.flj.student_system.entity.form;


import java.math.BigDecimal;

public class StudentCourseForm {

    private Integer courseId;

    private String courseName;
    
    private String name;

    private BigDecimal score;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "StudentCourseForm{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

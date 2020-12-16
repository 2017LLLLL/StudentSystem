package com.flj.student_system.enums;

public enum PeopleCodeEnum {

    TEACHER_CODE("Teacher",0),
    STUDENT_CODE("Student",1);

    private String descript;
    private int code;

    PeopleCodeEnum(String descript,int code) {
        this.code = code;
        this.descript = descript;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

}

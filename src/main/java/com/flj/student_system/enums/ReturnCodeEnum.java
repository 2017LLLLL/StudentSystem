package com.flj.student_system.enums;

public enum ReturnCodeEnum {

    RETURN_CODE_SUCCESS("SuccessCode",0),
    RETURN_CODE_FAIL("FailCode",1);

    private String descript;
    private int code;

    ReturnCodeEnum(String descript,int code) {
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

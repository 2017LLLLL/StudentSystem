package com.flj.student_system.enums;

public enum ReparisStateEnum {

    NOT_FINIFSH("待处理",Byte.parseByte("0")),
    FINISH_REPAIRS("已处理",Byte.parseByte("1")),
    EVALUATE_REPARIS("完成评价",Byte.parseByte("2")),
    QUIT_REPAIRS("取消评价",Byte.parseByte("3"));

    private String descript;
    private byte code;

    ReparisStateEnum(String descript, byte code) {
        this.code = code;
        this.descript = descript;
    }

    public byte getCode() {
        return code;
    }

    public void setCode(byte code) {
        this.code = code;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

}

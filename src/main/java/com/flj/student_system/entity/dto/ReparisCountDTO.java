package com.flj.student_system.entity.dto;

public class ReparisCountDTO {
    private Integer allReparis;
    private Integer finishReparis;
    private Integer notFinishReparis;
    private Integer evelReparis;

    public Integer getAllReparis() {
        return allReparis;
    }

    public void setAllReparis(Integer allReparis) {
        this.allReparis = allReparis;
    }

    public Integer getFinishReparis() {
        return finishReparis;
    }

    public void setFinishReparis(Integer finishReparis) {
        this.finishReparis = finishReparis;
    }

    public Integer getNotFinishReparis() {
        return notFinishReparis;
    }

    public void setNotFinishReparis(Integer notFinishReparis) {
        this.notFinishReparis = notFinishReparis;
    }

    public Integer getEvelReparis() {
        return evelReparis;
    }

    public void setEvelReparis(Integer evelReparis) {
        this.evelReparis = evelReparis;
    }
}

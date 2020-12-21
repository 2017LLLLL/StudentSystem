package com.flj.student_system.entity.dto;

import java.util.Arrays;

public class MenuDTO {
    private String title;
    private String icon;
    private String target;
    private String href;
    private MenuDTO[] child;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public MenuDTO[] getChild() {
        return child;
    }

    public void setChild(MenuDTO[] child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "title='" + title + '\'' +
                ", icon='" + icon + '\'' +
                ", target='" + target + '\'' +
                ", href='" + href + '\'' +
                ", child=" + Arrays.toString(child) +
                '}';
    }
}

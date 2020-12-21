package com.flj.student_system.entity.dto;

public class HomeInfo {

    private String title;

    private String href;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "HomeInfo{" +
                "title='" + title + '\'' +
                ", href='" + href + '\'' +
                '}';
    }
}

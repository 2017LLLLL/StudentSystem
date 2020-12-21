package com.flj.student_system.entity.dto;

public class LogoInfo {

    private String title;

    private String href;

    private String image;

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }



    @Override
    public String toString() {
        return "LoginInfo{" +
                "title='" + title + '\'' +
                ", href='" + href + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}

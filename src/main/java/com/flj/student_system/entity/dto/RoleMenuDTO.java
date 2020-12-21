package com.flj.student_system.entity.dto;

public class RoleMenuDTO {

    private HomeInfo homeInfo;

    private LogoInfo logoInfo;

    private MenuDTO[] menuInfo;

    public HomeInfo getHomeInfo() {
        return homeInfo;
    }

    public void setHomeInfo(HomeInfo homeInfo) {
        this.homeInfo = homeInfo;
    }

    public LogoInfo getLogoInfo() {
        return logoInfo;
    }

    public void setLogoInfo(LogoInfo logoInfo) {
        this.logoInfo = logoInfo;
    }

    public MenuDTO[] getMenuInfo() {
        return menuInfo;
    }

    public void setMenuInfo(MenuDTO[] menuInfo) {
        this.menuInfo = menuInfo;
    }

    @Override
    public String toString() {
        return "RoleMenuDTO{" +
                "tRoleHome=" + homeInfo +
                ", tRoleLogin=" + logoInfo +
                ", menuInfo=" + menuInfo +
                '}';
    }
}

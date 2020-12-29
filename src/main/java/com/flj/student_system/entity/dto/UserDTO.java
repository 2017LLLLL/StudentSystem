package com.flj.student_system.entity.dto;

public class UserDTO {
    private Integer peopleId;

    private Integer roleId;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(Integer peopleId) {
        this.peopleId = peopleId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public UserDTO(Integer peopleId, Integer roleId) {
        this.peopleId = peopleId;
        this.roleId = roleId;
    }

    public UserDTO() {
    }
}

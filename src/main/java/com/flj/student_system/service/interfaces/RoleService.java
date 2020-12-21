package com.flj.student_system.service.interfaces;

import com.flj.student_system.entity.dto.RoleMenuDTO;

public interface RoleService {

    /*
    * 获取菜单列表
    * */
    RoleMenuDTO getMenuInfo(Integer roleId);

}

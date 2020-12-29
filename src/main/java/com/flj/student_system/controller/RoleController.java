package com.flj.student_system.controller;

import com.flj.student_system.entity.dto.RoleMenuDTO;
import com.flj.student_system.entity.dto.UserDTO;
import com.flj.student_system.service.interfaces.RoleService;
import com.flj.student_system.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("role")
@Api(tags = "权限数据操作接口")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("getMenuByRoleId")
    @ApiOperation("获取角色对应的权限菜单")
    public RoleMenuDTO getMenuInfo(HttpSession httpSession){
        UserDTO userDTO = (UserDTO) httpSession.getAttribute("userDTO");
        if(userDTO == null){
            Result.returnFailWithMessage("用户未登录");
        }
        Integer roleId = userDTO.getRoleId();
        RoleMenuDTO menuInfo = roleService.getMenuInfo(roleId);
        return menuInfo;
    }

}

package com.flj.student_system.controller;


import com.flj.student_system.service.interfaces.CommenService;
import com.flj.student_system.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("commen")
@Api(tags = "公共操作接口")
public class CommenController {

    @Autowired
    private CommenService commenService;

    @PostMapping("updatePassword")
    @ApiOperation("修改密码")

    public Result updatePassword(
            @ApiParam(value = "人员编号（教师工号，学生学号）" , required=true ) @RequestParam("people_id")Integer peopleId,
            @ApiParam(value = "旧密码" , required=true ) @RequestParam("oldPassword")String oldPassword,
            @ApiParam(value = "新密码" , required=true ) @RequestParam("newPassword")String newPassword){
        if(peopleId == null || oldPassword == null || newPassword == null){
            return Result.returnFailWithMessage("数据插入失败，请检查数据是否存在或缺少关键信息");
        }
        commenService.updatePassword(peopleId, oldPassword, newPassword);
        return Result.returnSuccessWithOutData();
    }

}

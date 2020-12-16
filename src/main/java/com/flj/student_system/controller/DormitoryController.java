package com.flj.student_system.controller;

import com.flj.student_system.service.interfaces.DormitoryService;
import com.flj.student_system.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dormitory")
@Api(tags = "宿舍数据操作接口")
public class DormitoryController {

    @Autowired
    private DormitoryService dormitoryService;

    @GetMapping("getAllDormitory")
    @ApiOperation("获取所有宿舍信息")
    public Result getAllStudent(){
        return Result.returnSuccessWithData(dormitoryService.selectAllDormitory());
    }

}

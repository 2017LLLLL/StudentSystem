package com.flj.student_system.controller;

import com.flj.student_system.service.interfaces.ClassService;
import com.flj.student_system.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("class")
@Api(tags = "班级数据操作")
public class ClassController {

    @Autowired
    private ClassService classService;

    @GetMapping("getAllClass")
    @ApiOperation("获取所有班级及所属院系")
    public Result getAllCourse(){
        return Result.returnSuccessWithData(classService.selectAllClassDTO());
    }

}

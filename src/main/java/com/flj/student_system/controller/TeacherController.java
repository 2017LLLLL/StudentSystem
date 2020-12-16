package com.flj.student_system.controller;

import com.flj.student_system.entity.form.TeacherForm;
import com.flj.student_system.service.interfaces.TeacherService;
import com.flj.student_system.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teacher")
@Api(tags = "教师类数据操作接口")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("getAllTeacher")
    @ApiOperation("获取所有教师信息")
    public Result getAllTeacher(){
        return Result.returnSuccessWithData(teacherService.getAllTeacher());
    }

    @PostMapping("addTeacher")
    @ApiOperation("新增一个教师的信息")
    public Result addStudent(TeacherForm teacherForm){
        if(teacherForm == null){
            return Result.returnFailWithMessage("传入的值为空！");
        }
        int i = teacherService.insertOneTeacher(teacherForm);
        if(i != 1){
            return Result.returnFailWithMessage("数据插入失败，请检查数据是否存在或缺少关键信息！");
        }
        return Result.returnSuccessWithOutData();
    }
}

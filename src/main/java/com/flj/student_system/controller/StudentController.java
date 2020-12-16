package com.flj.student_system.controller;

import com.flj.student_system.entity.form.StudentForm;
import com.flj.student_system.service.interfaces.StudentService;
import com.flj.student_system.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
@Api(tags = "学生类数据操作接口")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("getAllStudent")
    @ApiOperation("获取所有学生信息")
    public Result getAllStudent(){
        return Result.returnSuccessWithData(studentService.getAllStudent());
    }


    @PostMapping("addStudent")
    @ApiOperation("新增一个学生的信息")
    public Result addStudent(StudentForm studentForm){
        if(studentForm == null){
            return Result.returnFailWithMessage("传入的值为空！");
        }
        int i = studentService.addStudent(studentForm);
        if(i != 1){
            return Result.returnFailWithMessage("数据插入失败，请检查数据是否存在或缺少关键信息！");
        }
        return Result.returnSuccessWithOutData();
    }



}

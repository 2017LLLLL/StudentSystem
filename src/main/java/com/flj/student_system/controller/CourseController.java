package com.flj.student_system.controller;

import com.flj.student_system.entity.TCourse;
import com.flj.student_system.entity.form.CourseForm;
import com.flj.student_system.service.interfaces.CourseService;
import com.flj.student_system.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("course")
@Api(tags = "课程数据操作接口")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("getAllCourse")
    @ApiOperation("获取所有课程信息")
    public Result getAllCourse(){
        return Result.returnSuccessWithData(courseService.getAllCourse());
    }

    @PostMapping("addCourse")
    @ApiOperation("新增某个课程")
    public Result addCourse(CourseForm courseForm){


        if(courseForm == null){
            return Result.returnFailWithMessage("传入对象为空，请检查是否有误");
        }
        int insertResult = courseService.addCourse(courseForm);
        if(insertResult != 1){
            return Result.returnFailWithMessage("数据插入失败，请检查数据是否存在或缺少关键信息");
        }
        return Result.returnSuccessWithOutData();
    }

    @GetMapping("selectCourseByTeacherId")
    @ApiOperation("查询某个教师所任课程")
    public Result selectAllCourseByMy(@ApiParam(value = "教师工号" , required=true ) @RequestParam("teacherId") Integer teacherId){
        if(teacherId == null){
            return Result.returnFailWithMessage("传入的教师工号为空！");
        }
        List<TCourse> tCourses = courseService.selectCourseByTeacherId(teacherId);
        return Result.returnSuccessWithData(tCourses);
    }

}

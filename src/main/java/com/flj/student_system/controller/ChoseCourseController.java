package com.flj.student_system.controller;

import com.flj.student_system.entity.TCourse;
import com.flj.student_system.entity.form.ChoseCouseFrom;
import com.flj.student_system.entity.form.StudentCourseForm;
import com.flj.student_system.service.interfaces.ChoseCourseService;
import com.flj.student_system.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("choseCourseHandler")
@Api(tags = "选课数据操作")
public class ChoseCourseController {

    @Autowired
    private ChoseCourseService courseChoseService;

    @PostMapping("choseCouese")
    @ApiOperation("选课")
    public Result choseCouese(ChoseCouseFrom choseCouseFrom){
        new Exception("asdasdasdsa");
        if(choseCouseFrom == null){
            return Result.returnFailWithMessage("传入的值为空！");
        }
        courseChoseService.choseCourse(choseCouseFrom);
        return Result.returnSuccessWithOutData();
    }

    @PostMapping("quitCouese")
    @ApiOperation("退选课程")
    public Result quitCouese(ChoseCouseFrom quitCourseForm){
        if(quitCourseForm == null){
            return Result.returnFailWithMessage("传入的值为空！");
        }
        courseChoseService.quitCourse(quitCourseForm);
        return Result.returnSuccessWithOutData();
    }

    @PostMapping("mark")
    @ApiOperation("打分")
    public Result mark(ChoseCouseFrom markCourseForm){
        if(markCourseForm == null){
            return Result.returnFailWithMessage("传入的值为空！");
        }
        courseChoseService.mark(markCourseForm);
        return Result.returnSuccessWithOutData();
    }

    @GetMapping("selectCourseAndMark")
    @ApiOperation("查询某个学生所选的课程及成绩")
    public Result selectAllCourseByMy(@ApiParam(value = "学生学号" , required=true ) @RequestParam("studentNum") Long studentNum){
        if(studentNum == null){
            return Result.returnFailWithMessage("传入的学生学号为空！");
        }
        List<TCourse> tCourses = courseChoseService.selectedCourse(studentNum);
        return Result.returnSuccessWithData(tCourses);
    }

    @GetMapping("select")
    @ApiOperation("查询选了某个课程的所有学生")
    public Result selectAllCourseByMy(@ApiParam(value = "课程ID" , required=true ) @RequestParam("courseId") Integer courseId){
        if(courseId == null){
            return Result.returnFailWithMessage("传入的课程编号为空！");
        }
        List<StudentCourseForm> tCourses = courseChoseService.selectsStudentByCourseId(courseId);
        return Result.returnSuccessWithData(tCourses);
    }

}

package com.flj.student_system.controller;

import com.flj.student_system.entity.TRepairs;
import com.flj.student_system.entity.TStudent;
import com.flj.student_system.entity.dto.ReparisCountDTO;
import com.flj.student_system.entity.dto.ReparisStateDTO;
import com.flj.student_system.entity.dto.UserDTO;
import com.flj.student_system.entity.form.RepairsForm;
import com.flj.student_system.exception.MyException;
import com.flj.student_system.service.interfaces.ReparisService;
import com.flj.student_system.service.interfaces.StudentService;
import com.flj.student_system.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("repairs")
@Api(tags = "维修工单数据操作接口")
public class RepairsController {

    @Autowired
    private ReparisService reparisService;

    @Autowired
    private StudentService studentService;

    @GetMapping("getAllRepairs")
    @ApiOperation("获取所有维修工单信息")
    public Result getAllStudent(){
        return Result.returnSuccessWithData(reparisService.getAllReparis());
    }

    @PostMapping("addRepairs")
    @ApiOperation("新增维修工单")
    public Result addRepairs(RepairsForm repairsForm){
        System.out.println(repairsForm);
        if(repairsForm == null){
            return Result.returnFailWithMessage("传入的值为空！");
        }
        int i = reparisService.addReparis(repairsForm);
        if(i != 1){
            return Result.returnFailWithMessage("数据插入失败，请检查数据是否存在或缺少关键信息！");
        }
        return Result.returnSuccessWithOutData();
    }

    @PostMapping("updateRepairs")
    @ApiOperation("修改工单状态")
    public Result addStudent(TRepairs tRepairs){
        if(tRepairs == null){
            return Result.returnFailWithMessage("传入的值为空！");
        }
        int i = reparisService.changeStateReparis(tRepairs);
        if(i != 1){
            return Result.returnFailWithMessage("数据插入失败，请检查数据是否存在或缺少关键信息！");
        }
        return Result.returnSuccessWithOutData();
    }


    @GetMapping("getAllTypeReparis")
    @ApiOperation("获取所有类型工单总数")
    public Result getAllTypeReparis(){
        ReparisCountDTO reparisCountDTO = reparisService.selectAllType();
        return Result.returnSuccessWithData(reparisCountDTO);
    }

    @GetMapping("selectGroupsType")
    @ApiOperation("获取所有类型工单种类")
    public Result getGroupsType(){
        List<ReparisStateDTO> reparisGroupType = reparisService.selectGroupsType();
        return Result.returnSuccessWithData(reparisGroupType);
    }


    @PostMapping("getAllReparisBy")
    @ApiOperation("获取本宿舍所有工单")
    public Result getAllReparisBy(UserDTO userDTO){
        Integer peopleId = userDTO.getPeopleId();
        System.out.println(peopleId);
        if(peopleId == null){
            throw new MyException("用户未登录");
        }
        TStudent tStudent = studentService.selectByStudentNum(peopleId);
        List<TRepairs> allReparisByDormitory = reparisService.getAllReparisByDormitory(tStudent.getDormitoryNum());
        return Result.returnSuccessWithData(allReparisByDormitory);
    }
}

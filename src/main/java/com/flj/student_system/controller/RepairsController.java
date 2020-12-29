package com.flj.student_system.controller;

import com.flj.student_system.entity.TRepairs;
import com.flj.student_system.entity.TStudent;
import com.flj.student_system.entity.dto.ReparisCountDTO;
import com.flj.student_system.entity.dto.ReparisStateDTO;
import com.flj.student_system.entity.dto.UserDTO;
import com.flj.student_system.entity.form.RepairsForm;
import com.flj.student_system.enums.ReparisStateEnum;
import com.flj.student_system.exception.MyException;
import com.flj.student_system.service.interfaces.ReparisService;
import com.flj.student_system.service.interfaces.StudentService;
import com.flj.student_system.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
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
    public Result updateStateStudent(TRepairs tRepairs){
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
        ReparisCountDTO reparisCountDTO = reparisService.selectAllType(null);
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
    public Result getAllReparisBy(HttpSession httpSession){
        UserDTO userDTO = (UserDTO) httpSession.getAttribute("userDTO");
        Integer peopleId = userDTO.getPeopleId();
        if(peopleId == null){
            throw new MyException("用户未登录");
        }
        TStudent tStudent = studentService.selectByStudentNum(peopleId);
        List<TRepairs> allReparisByDormitory = reparisService.getAllReparisByDormitory(tStudent.getDormitoryNum());
        return Result.returnSuccessWithData(allReparisByDormitory);
    }

    @GetMapping("getAllReparisCountBy")
    @ApiOperation("获取本宿舍所有工单状态数")
    public Result getAllReparisCountBy(HttpSession httpSession){
        UserDTO userDTO = (UserDTO) httpSession.getAttribute("userDTO");
        System.out.println(userDTO);
        Integer peopleId = userDTO.getPeopleId();
        if(peopleId == null){
            throw new MyException("用户未登录");
        }
        TStudent tStudent = studentService.selectByStudentNum(peopleId);
        ReparisCountDTO reparisCountDTO = reparisService.selectAllType(tStudent.getDormitoryNum());
        return Result.returnSuccessWithData(reparisCountDTO);
    }


    @PostMapping("getAllRepairsWhere")
    @ApiOperation("条件获取对应报修单")
    public Result getAllReparisBy(@RequestParam(value = "dormitoryNum",required = false)Integer dormitoryNum,@RequestParam(required = false,value = "state")Integer state){
        List<TRepairs> allReparisByDormitory = reparisService.getAllReparisByDormitoryOrState(dormitoryNum,state);
        return Result.returnSuccessWithData(allReparisByDormitory);
    }


    @PostMapping("evaluateReparis")
    @ApiOperation("评价工单")
    public Result evaluateReparisBy(TRepairs tRepairs){
        reparisService.evaluateReparis(tRepairs);
        return Result.returnSuccessWithOutData();
    }

    @PostMapping("finishReparis")
    @ApiOperation("完成工单")
    public Result finishReparisBy(TRepairs tRepairs){
        tRepairs.setState(ReparisStateEnum.FINISH_REPAIRS.getCode());
        updateStateStudent(tRepairs);
        return Result.returnSuccessWithOutData();
    }

    @PostMapping("quitReparis")
    @ApiOperation("取消工单")
    public Result quitReparis(TRepairs tRepairs){
        tRepairs.setState(ReparisStateEnum.QUIT_REPAIRS.getCode());
        updateStateStudent(tRepairs);
        return Result.returnSuccessWithOutData();
    }

    @PostMapping("changeReparis")
    @ApiOperation("修改工单")
    public Result changeReparis(TRepairs tRepairs){
        reparisService.updateInfo(tRepairs);
        return Result.returnSuccessWithOutData();
    }

}

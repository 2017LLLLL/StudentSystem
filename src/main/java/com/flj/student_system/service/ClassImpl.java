package com.flj.student_system.service;

import com.flj.student_system.dao.TAcademyClassMapper;
import com.flj.student_system.dao.TAcademyMapper;
import com.flj.student_system.dao.TClassAndGradeMapper;
import com.flj.student_system.entity.TClassAndGrade;
import com.flj.student_system.entity.dto.ClassDTO;
import com.flj.student_system.exception.MyException;
import com.flj.student_system.service.interfaces.ClassService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassImpl implements ClassService {

    @Autowired
    private TClassAndGradeMapper tClassAndGradeMapper;

    @Autowired
    private TAcademyMapper tAcademyMapper;

    @Autowired
    private TAcademyClassMapper tAcademyClassMapper;


    @Override
    public List<ClassDTO> selectAllClassDTO() {
        List<TClassAndGrade> tClassAndGrades = tClassAndGradeMapper.selectAllClass();
        List<ClassDTO> classDTOList = new ArrayList<>();
        if(tClassAndGrades == null || tClassAndGrades.size() == 0){
            throw new MyException("暂无任何班级可显示");
        }
        for (TClassAndGrade tClassAndGrade:tClassAndGrades) {
            ClassDTO classDTO = new ClassDTO();
            BeanUtils.copyProperties(tClassAndGrade,classDTO);
            int acadeId =  tAcademyClassMapper.selectByClassId(tClassAndGrade.getClassId());
            String acadeName = tAcademyMapper.selectByAcademyClassId(acadeId);
            classDTO.setAcademyName(acadeName);
            classDTOList.add(classDTO);
        }
        return classDTOList;
    }
}

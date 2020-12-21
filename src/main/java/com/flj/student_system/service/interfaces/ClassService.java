package com.flj.student_system.service.interfaces;

import com.flj.student_system.entity.dto.ClassDTO;

import java.util.List;

public interface ClassService {

    /*
    * 查询所有班级
    * */
    List<ClassDTO> selectAllClassDTO();

}

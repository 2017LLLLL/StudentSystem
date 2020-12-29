package com.flj.student_system.service.interfaces;

import com.flj.student_system.entity.TCourse;
import com.flj.student_system.entity.dto.CourseDTO;
import com.flj.student_system.entity.form.CourseForm;

import java.util.List;

public interface CourseService {

    /*
    * 查询所有课程信息
    * */
    List<CourseDTO> getAllCourse();


    /*
    * 新增课程
    * */
    int addCourse(CourseForm courseForm);

    /*
    * 查询某个老师所教的所有课程
    * */
    List<TCourse> selectCourseByTeacherId(Integer teacherId);

    /*
    * 查询课程总数
    * */
    int selectAllCountCourse();

}

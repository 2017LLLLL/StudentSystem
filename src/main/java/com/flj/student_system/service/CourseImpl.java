package com.flj.student_system.service;

import com.flj.student_system.dao.TCourseMapper;
import com.flj.student_system.dao.TTeacherMapper;
import com.flj.student_system.entity.TCourse;
import com.flj.student_system.entity.dto.CourseDTO;
import com.flj.student_system.entity.form.CourseForm;
import com.flj.student_system.exception.MyException;
import com.flj.student_system.service.interfaces.CourseService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CourseImpl implements CourseService {

    @Autowired
    private TCourseMapper tCourseMapper;

    @Autowired
    private TTeacherMapper tTeacherMapper;

    @Override
    public List<CourseDTO> getAllCourse() {
        List<TCourse> tCourses = tCourseMapper.selectAllCourse();
        List<CourseDTO> courseDTOList = new ArrayList<>();
        for (TCourse tCourse:tCourses) {
            CourseDTO courseDTO = new CourseDTO();
            BeanUtils.copyProperties(tCourse,courseDTO);
            String teacherName = tTeacherMapper.selectNameByTeacherId(tCourse.getTeacherNum());
            courseDTO.setTeacherName(teacherName);
            courseDTOList.add(courseDTO);
        }
        return courseDTOList;
    }

    @Override
    public int addCourse(CourseForm courseForm) {
        if(courseForm == null){
            return -1;
        }
        if(courseForm.getCourseId() == null || courseForm.getCourseName() == null || courseForm.getTeacherNum() == null){
            return -2;
        }
        System.out.println(courseForm);
        int insertResult = tCourseMapper.insertOneCourse(courseForm);
        return insertResult;
    }

    @Override
    public List<TCourse> selectCourseByTeacherId(Integer teacherId) {
        if(teacherId == null){
            throw new MyException("传入教师工号为空，查询不到数据");
        }
        List<TCourse> tCourses = tCourseMapper.selectCourseByTeacherId(teacherId);
        if(tCourses == null || tCourses.size() == 0){
            throw new MyException("未查询到数据，该教师未发布任何课程！");
        }
        return tCourses;
    }
}

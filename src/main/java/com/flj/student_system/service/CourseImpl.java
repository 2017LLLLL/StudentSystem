package com.flj.student_system.service;

import com.flj.student_system.dao.TCourseMapper;
import com.flj.student_system.entity.TCourse;
import com.flj.student_system.entity.form.CourseForm;
import com.flj.student_system.exception.MyException;
import com.flj.student_system.service.interfaces.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseImpl implements CourseService {

    @Autowired
    private TCourseMapper tCourseMapper;

    @Override
    public List<TCourse> getAllCourse() {
        return tCourseMapper.selectAllCourse();
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

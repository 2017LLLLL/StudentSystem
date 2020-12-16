package com.flj.student_system.service.interfaces;

import com.flj.student_system.entity.TCourse;
import com.flj.student_system.entity.form.ChoseCouseFrom;
import com.flj.student_system.entity.form.StudentCourseForm;

import java.util.List;

public interface ChoseCourseService {

    /*
    * 选课
    * */
    int choseCourse(ChoseCouseFrom choseCouseFrom);

    /*
    * 退选
    * */
    int quitCourse(ChoseCouseFrom choseCouseFrom);

    /*
    * 打分
    * */
    int mark(ChoseCouseFrom choseCouseFrom);

    /*
    * 查看所选课程及分数
    * */
    List<TCourse> selectedCourse(Long studentNum);

    /*
    * 查询选了某个课程的学生及分数
    * */
    List<StudentCourseForm> selectsStudentByCourseId(Integer courseId);
}

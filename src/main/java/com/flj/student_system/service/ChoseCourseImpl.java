package com.flj.student_system.service;

import com.flj.student_system.dao.TChoseCourseMapper;
import com.flj.student_system.entity.TCourse;
import com.flj.student_system.entity.form.ChoseCouseFrom;
import com.flj.student_system.entity.form.StudentCourseForm;
import com.flj.student_system.exception.MyException;
import com.flj.student_system.service.interfaces.ChoseCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoseCourseImpl implements ChoseCourseService {

    @Autowired
    private TChoseCourseMapper tChoseCourseMapper;

    @Override
    public int choseCourse(ChoseCouseFrom choseCouseFrom) {
        System.out.println(choseCouseFrom);
        if(choseCouseFrom == null){
            throw new MyException("选课内容为空，请检查");
        }
        if(choseCouseFrom.getCourseId() == null || choseCouseFrom.getStudentNum() == null ){
            throw new MyException("缺少选课相关参数，请检查参数是否有误");
        }
        int resultCode = tChoseCourseMapper.choseCouese(choseCouseFrom);
        if(resultCode != 1){
            new MyException("选课失败，请联系管理员查看系统是否有误");
        }
        return resultCode;
    }


    @Override
    public int quitCourse(ChoseCouseFrom quitCourse) {
        if(quitCourse == null){
            throw new MyException("退选课程内容为空，请检查");
        }
        if(quitCourse.getCourseId() == null || quitCourse.getStudentNum() == null ){
            throw new MyException("缺少退课相关参数，请检查参数是否有误");
        }
        int resultCode = tChoseCourseMapper.quitCourse(quitCourse);
        if(resultCode != 1){
            throw new MyException("退课失败，请联系管理员查看系统是否有误");
        }
        return resultCode;
    }

    @Override
    public int mark(ChoseCouseFrom markForm) {
        if(markForm == null){
            throw new MyException("打分课程内容为空，请检查");
        }
        if(markForm.getCourseId() == null || markForm.getStudentNum() == null || markForm.getScore() == null){
            throw new MyException("缺少打分相关参数，请检查参数是否有误");
        }
        int markResult = tChoseCourseMapper.mark(markForm);
        if(markResult != 1){
            throw new MyException("打分失败，请联系管理员查看系统是否有误");
        }
        return markResult;
    }

    @Override
    public List<TCourse> selectedCourse(Long studentNum) {
        if(studentNum == null){
            throw new MyException("学生学号为空，查询不到所选课程");
        }
        List<TCourse> tCourses = tChoseCourseMapper.selectByStudentNum(studentNum);
        if(tCourses == null || tCourses.size() == 0){
            throw new MyException("该学生未选课，数据为空！");
        }
        return tCourses;
    }

    @Override
    public List<StudentCourseForm> selectsStudentByCourseId(Integer courseId) {
        if(courseId == null){
            throw new MyException("课程编号为空，查询不到所选课程");
        }
        List<StudentCourseForm> studentCourseFormList = tChoseCourseMapper.selectsStudentByCourseId(courseId);
        System.out.println(studentCourseFormList);
        if(studentCourseFormList == null || studentCourseFormList.size() == 0){
            throw new MyException("该课程暂无选课学生，数据为空！");
        }
        return studentCourseFormList;
    }


}

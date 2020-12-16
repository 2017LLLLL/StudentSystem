package com.flj.student_system.util;

import com.flj.student_system.enums.PeopleCodeEnum;

public class TypeCheck {


    /*
    * 判断类型
    * */
    public static int peopleTypeCheck(Integer num){
        String substring = String.valueOf(num).substring(0, 1);
        return "9".equals(substring) ? PeopleCodeEnum.TEACHER_CODE.getCode():PeopleCodeEnum.STUDENT_CODE.getCode();
    }

}

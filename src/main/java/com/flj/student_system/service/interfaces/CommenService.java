package com.flj.student_system.service.interfaces;

import com.flj.student_system.entity.dto.UserDTO;

public interface CommenService {

    /*
    * 公共修改密码操作
    * */
    int updatePassword(int num,String oldPassword,String newPassword);

    /*
    * 登录
    * */
    UserDTO login(Integer peopleId, String password);
}

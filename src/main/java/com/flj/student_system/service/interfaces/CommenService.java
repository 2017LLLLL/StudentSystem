package com.flj.student_system.service.interfaces;

public interface CommenService {

    /*
    * 公共修改密码操作
    * */
    int updatePassword(int num,String oldPassword,String newPassword);

    /*
    * 登录
    * */
    void login(Integer peopleId, String password);
}

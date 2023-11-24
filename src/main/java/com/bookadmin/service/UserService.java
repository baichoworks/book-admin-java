package com.bookadmin.service;

import com.bookadmin.entity.po.User;
import com.bookadmin.entity.vo.UserVo;

import java.util.List;

public interface UserService {

    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    User getByUserName(String username);

    /**
     * 用户注册
     * @param po
     */
    void addUser(User po);

    /**
     * 修改密码
     * @param po
     */
    void updatePassword(User po);

    /**
     * 查询所有用户
     * @return
     */
    List<UserVo> selectAllUser();
}

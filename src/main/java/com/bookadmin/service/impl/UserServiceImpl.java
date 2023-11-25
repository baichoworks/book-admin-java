package com.bookadmin.service.impl;

import com.bookadmin.entity.po.User;
import com.bookadmin.entity.vo.UserVo;
import com.bookadmin.mapper.UserMapper;
import com.bookadmin.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public User getByUserName(String username) {
        return userMapper.selectByUserName(username);
    }

    @Override
    public void addUser(User po) {
        userMapper.insertUser(po);
    }

    @Override
    public void updatePassword(User po) {
        userMapper.updatePassword(po);
    }

    @Override
    public List<UserVo> selectAllUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public void updateUser(User po) {
        userMapper.updateUser(po);
    }

    @Override
    public void deleteUser(User po) {
        userMapper.deleteUser(po);
    }

}

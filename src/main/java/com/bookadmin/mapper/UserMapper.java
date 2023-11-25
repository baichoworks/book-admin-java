package com.bookadmin.mapper;

import com.bookadmin.entity.po.User;
import com.bookadmin.entity.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    User selectByUserName(String username);

    /**
     * 用户注册
     * @param po
     */
    void insertUser(User po);

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

    /**
     * 修改用户
     * @param po
     */
    void updateUser(User po);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(Integer id);
}

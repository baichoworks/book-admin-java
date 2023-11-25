package com.bookadmin.controller;

import com.bookadmin.entity.po.User;
import com.bookadmin.entity.vo.UserVo;
import com.bookadmin.service.UserService;
import com.bookadmin.util.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    /**
     * 用户登录
     * @param vo
     * @return
     */
    @PostMapping("/login")
    public Result login(@RequestBody User vo){
        User user = userService.getByUserName(vo.getUsername());
        // 判断登录的用户信息是否存在
        if (user == null) {
            return Result.getInstance()
                    .setSuccess(false)
                    .setMessage("用户不存在");
        }
        // 判断当前的密码是否正确
        if (!user.getPassword().equals(vo.getPassword())) {
            return Result.getInstance()
                    .setSuccess(false)
                    .setMessage("账号或密码错误");
        }
        // 封装UserVo
        UserVo userVo = new UserVo();
        userVo.setId(user.getId());
        userVo.setUsername(user.getUsername());
        return Result.getInstance()
                .setMessage("登录成功")
                .setData(userVo);
    }

    /**
     * 用户注册
     * @param vo
     * @return
     */
    @PostMapping("/signup")
    public Result signup(@RequestBody User vo){
        // 判断用户信息是否存在
        User user = userService.getByUserName(vo.getUsername());
        if (user != null) {
            return Result.getInstance()
                    .setSuccess(false)
                    .setMessage("账号已存在");
        }
        userService.addUser(vo);
        return Result.getInstance()
                .setMessage("注册成功");
    }

    /**
     * 修改密码
     * @param vo
     * @return
     */
    @PostMapping("/changePass")
    public Result changePass(@RequestBody User vo){
        userService.updatePassword(vo);
        return Result.getInstance()
                .setMessage("修改成功");
    }

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/getAllUser")
    public Result getAllUser(){
        List<UserVo> userList = userService.selectAllUser();
        return Result.getInstance()
                .setData(userList);
    }

    /**
     * 修改用户
     * @param vo
     * @return
     */
    @PostMapping("/updateUser")
    public Result updateUser(@RequestBody User vo){
        userService.updateUser(vo);
        return Result.getInstance()
                .setMessage("修改成功");
    }

    @PostMapping("deleteUser")
    public Result deleteUser(@RequestBody User vo){
        userService.deleteUser(vo.getId());
        return Result.getInstance()
                .setMessage("删除成功");
    }
}

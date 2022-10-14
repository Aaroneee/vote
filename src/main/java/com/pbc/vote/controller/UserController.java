package com.pbc.vote.controller;

import com.pbc.vote.entity.User;
import com.pbc.vote.model.vo.ResultInfo;
import com.pbc.vote.service.IUserService;
import com.pbc.vote.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * describe: 用户
 *
 * @Author: Aaron
 * @Date: 2022/10/13 19:20
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private Result result;
    @Autowired
    private IUserService userService;

    /**
     * describe: 登陆
     *
     * @Author: Aaron
     * @Date: 2022/10/13 19:55
     */
    @PostMapping("login")
    public ResultInfo login(User user) {
        return result.success(userService.login(user));
    }

    /**
     * describe: 查询列表
     *
     * @Author: Aaron
     * @Date: 2022/10/14 18:46
     */
    @GetMapping("queryList")
    public ResultInfo queryList(User user) {
        return result.success(userService.queryList(user));
    }

    /**
     * describe: 修改用户信息
     *
     * @Author: Aaron
     * @Date: 2022/10/14 19:14
     */
    @PostMapping("updateUser")
    public ResultInfo updateUser(User user) {
        userService.updateUser(user);
        return result.success();
    }

    /**
     * describe: 根据ID删除用户
     *
     * @Author: Aaron
     * @Date: 2022/10/14 19:53
     */
    @PostMapping("delById")
    public ResultInfo delById(Integer id) {
        userService.delById(id);
        return result.success();
    }

    /**
     * describe: 添加用户
     *
     * @Author: Aaron
     * @Date: 2022/10/14 20:15
     */
    @PutMapping("addUser")
    public ResultInfo addUser(User user) {
        userService.addUser(user);
        return result.success();
    }
}

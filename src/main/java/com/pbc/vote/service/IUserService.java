package com.pbc.vote.service;

import com.pbc.vote.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Aaron
 * @since 2022-10-13
 */
public interface IUserService extends IService<User> {

    /**
     * describe: 登陆
     *
     * @Author: Aaron
     * @Date: 2022/10/13 19:56
     */
    User login(User user);

    /**
     * describe: 查询列表
     *
     * @Author: Aaron
     * @Date: 2022/10/14 18:46
     */
    List<User> queryList(User user);

    /**
     * describe: 修改用户信息
     *
     * @Author: Aaron
     * @Date: 2022/10/14 19:14
     */
    void updateUser(User user);

    /**
     * describe: 删除用户
     *
     * @Author: Aaron
     * @Date: 2022/10/14 20:07
     */
    void delById(Integer id);

    /**
     * describe: 添加用户
     *
     * @Author: Aaron
     * @Date: 2022/10/14 20:17
     */
    void addUser(User user);
}

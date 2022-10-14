package com.pbc.vote.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pbc.vote.entity.User;
import com.pbc.vote.mapper.UserMapper;
import com.pbc.vote.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pbc.vote.utils.AssertUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Aaron
 * @since 2022-10-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        AssertUtil.isTrue(StringUtils.isBlank(user.getAccount()),"用户名不能为空");
        AssertUtil.isTrue(StringUtils.isBlank(user.getPwd()),"密码不能为空");

        List<User> users=this.list(new QueryWrapper<User>()
                .eq("account",user.getAccount()).eq("pwd",user.getPwd()));

        AssertUtil.isTrue(CollectionUtils.isEmpty(users),"无此用户");
        AssertUtil.isTrue(users.size()>1,"用户信息错误,请联系管理员");
        return users.get(0);
    }

    @Override
    public List<User> queryList(User user) {
        return this.list();
    }

    @Override
    public void updateUser(User user) {
        AssertUtil.isTrue(!this.updateById(user),"修改失败");
    }

    @Override
    public void delById(Integer id) {
        AssertUtil.isTrue(!this.removeById(id),"删除失败");
    }

    @Override
    public void addUser(User user) {
        AssertUtil.isTrue(StringUtils.isBlank(user.getAccount()),"用户名不能为空");
        AssertUtil.isTrue(StringUtils.isBlank(user.getName()),"名称不能为空");
        user.setPwd("Pass437\\");
        AssertUtil.isTrue(!this.save(user),"添加用户失败");
    }
}

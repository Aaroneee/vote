package com.pbc.vote.controller;

import com.pbc.vote.entity.User;
import com.pbc.vote.model.vo.ResultInfo;
import com.pbc.vote.service.ITaskService;
import com.pbc.vote.service.IUserService;
import com.pbc.vote.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "task")
public class TaskController {
    @Autowired
    private Result result;
    @Autowired
    private ITaskService taskService;

    /**
     * describe: 查询列表
     *
     * @Author: Aaron
     * @Date: 2022/10/14 21:16
     */
    @GetMapping("queryList")
    public ResultInfo queryList() {
        return result.success(taskService.queryList());
    }

    /**
     * describe: 添加测试任务
     *
     * @Author: Aaron
     * @Date: 2022/10/14 21:57
     */
    @PutMapping("addTask")
    public ResultInfo addTask() {
        return result.success(taskService.addTask());
    }
}

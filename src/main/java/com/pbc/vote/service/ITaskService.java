package com.pbc.vote.service;

import com.pbc.vote.entity.Task;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pbc.vote.model.vo.TaskVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Aaron
 * @since 2022-10-14
 */
public interface ITaskService extends IService<Task> {

    /**
     * describe: 查询列表
     *
     * @Author: Aaron
     * @Date: 2022/10/14 21:21
     */
    List<TaskVO> queryList();
}

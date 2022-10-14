package com.pbc.vote.service.impl;

import com.pbc.vote.entity.Task;
import com.pbc.vote.mapper.TaskMapper;
import com.pbc.vote.model.vo.TaskVO;
import com.pbc.vote.service.ITaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Aaron
 * @since 2022-10-14
 */
@Service
public class TaskServiceImpl extends ServiceImpl<TaskMapper, Task> implements ITaskService {
    @Autowired
    private TaskMapper taskMapper;

    @Override
    public List<TaskVO> queryList() {
        return taskMapper.queryList();
    }
}

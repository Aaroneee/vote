package com.pbc.vote.service.impl;

import com.pbc.vote.entity.TaskDetails;
import com.pbc.vote.mapper.TaskDetailsMapper;
import com.pbc.vote.service.ITaskDetailsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Aaron
 * @since 2022-10-14
 */
@Service
public class TaskDetailsServiceImpl extends ServiceImpl<TaskDetailsMapper, TaskDetails> implements ITaskDetailsService {

}

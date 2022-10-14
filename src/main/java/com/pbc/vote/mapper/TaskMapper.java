package com.pbc.vote.mapper;

import com.pbc.vote.entity.Task;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pbc.vote.model.vo.TaskVO;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Aaron
 * @since 2022-10-14
 */
public interface TaskMapper extends BaseMapper<Task> {

    /**
     * describe: 查询任务列表
     *
     * @Author: Aaron
     * @Date: 2022/10/14 21:24
     */
    List<TaskVO> queryList();
}

package com.pbc.vote.controller;

import com.pbc.vote.service.ITaskDetailsService;
import com.pbc.vote.service.ITaskService;
import com.pbc.vote.service.IUserService;
import com.pbc.vote.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "taskDetails")
public class TaskDetailsController {
    @Autowired
    private Result result;
    @Autowired
    private ITaskDetailsService taskDetailsService;
}

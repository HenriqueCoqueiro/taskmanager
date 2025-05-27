package com.henrique.taskmanager.controller;

import com.henrique.taskmanager.dto.TaskOutputDto;
import com.henrique.taskmanager.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<TaskOutputDto> findAll(){
        return taskService.findAll();
    }

}

package com.henrique.taskmanager.services;

import com.henrique.taskmanager.dto.TaskInputDto;
import com.henrique.taskmanager.dto.TaskOutputDto;
import com.henrique.taskmanager.entities.Task;
import com.henrique.taskmanager.factories.TaskFactory;
import com.henrique.taskmanager.repositories.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepo taskRepo;

    @Transactional(readOnly = true)
    public List<TaskOutputDto> findAll(){
        return taskRepo.findAll().stream().map(x -> new TaskOutputDto(x)).toList();
    }

    @Transactional
    public void create(TaskInputDto inputDto){
        Task task = TaskFactory.fromDto(inputDto);
        taskRepo.save(task);
    }


}

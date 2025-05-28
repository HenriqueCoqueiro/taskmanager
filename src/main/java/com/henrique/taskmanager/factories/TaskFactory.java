package com.henrique.taskmanager.factories;

import com.henrique.taskmanager.dto.TaskInputDto;
import com.henrique.taskmanager.entities.Task;
import com.henrique.taskmanager.enums.TaskStatus;

public class TaskFactory {

    public static Task fromDto(TaskInputDto dto){
        Task task = new Task();
        task.setTitle(dto.getTitle());
        task.setDescription(dto.getDescription());
        task.setDueDate(dto.getDueDate());
        task.setTaskStatus(TaskStatus.TO_DO);
        return task;
    }
}

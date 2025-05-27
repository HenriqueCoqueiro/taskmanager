package com.henrique.taskmanager.dto;

import com.henrique.taskmanager.entities.Task;
import com.henrique.taskmanager.enums.TaskStatus;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;

public class TaskOutputDto {

    private Long id;
    private String title;
    private String description;
    private TaskStatus taskStatus;
    private LocalDate dueDate;

    public TaskOutputDto(){
    }

    public TaskOutputDto(Task entity){
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}

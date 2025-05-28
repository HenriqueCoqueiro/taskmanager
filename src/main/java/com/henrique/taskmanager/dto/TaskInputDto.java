package com.henrique.taskmanager.dto;

import com.henrique.taskmanager.entities.Task;

import java.time.LocalDate;

public class TaskInputDto {
    private String title;
    private String description;
    private LocalDate dueDate;

    public TaskInputDto(){
    }

    public TaskInputDto(Task entity){
        this.title = entity.getTitle();
        this.description = entity.getDescription();
        this.dueDate = entity.getDueDate();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
}

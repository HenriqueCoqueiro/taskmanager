package com.henrique.taskmanager.repositories;

import com.henrique.taskmanager.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository <Task, Long> {
}

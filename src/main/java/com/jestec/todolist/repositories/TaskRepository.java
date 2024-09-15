package com.jestec.todolist.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jestec.todolist.tasks.TaskModel;

public interface TaskRepository extends JpaRepository<TaskModel,UUID>{

    
}

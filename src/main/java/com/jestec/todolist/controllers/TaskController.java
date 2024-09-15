package com.jestec.todolist.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jestec.todolist.repositories.TaskRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/tasks")
public class TaskController {

@Autowired
public TaskRepository repository;

 @PostMapping("/save")
 public String create(@RequestBody String entity) {
     //TODO: process POST request
     
     return entity;
 }
 
}

package com.jestec.todolist.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jestec.todolist.entities.UserModel;


public interface UserRepository extends JpaRepository<UserModel, UUID>{
    UserModel findByUsername(String username);
    UserModel findByEmail(String email);

    
}
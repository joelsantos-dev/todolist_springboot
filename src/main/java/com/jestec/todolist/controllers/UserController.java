package com.jestec.todolist.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jestec.todolist.entities.UserModel;
import com.jestec.todolist.repositories.UserRepository;

import at.favre.lib.crypto.bcrypt.BCrypt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/users")
public class UserController {

@Autowired
private UserRepository repository;


@PostMapping("/save")
public ResponseEntity create(@RequestBody UserModel user) {
    var userModel =this.repository.findByUsername(user.getUsername());
    var userModelEmail =this.repository.findByEmail(user.getEmail());

    if (userModel!=null) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("O usuario já existe");
    }
    if (userModelEmail!=null) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Este Email já está associado a uma conta");
    }
    
      var passwordHashred=BCrypt.withDefaults().hashToString(12,user.getPassword().toCharArray());
      user.setPassword(passwordHashred);
      var userCreated=this.repository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
}

}

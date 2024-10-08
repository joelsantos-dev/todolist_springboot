package com.jestec.todolist.tasks;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
 
@Entity(name = "tb_tasks")
public class TaskModel {
@Id
@GeneratedValue(generator = "UUID")
private UUID id;
private String description;

@Column(length = 50)
private String title;
private LocalDateTime startAt;
private LocalDateTime endtAt;
private String prioroty;

@CreationTimestamp
private LocalDateTime createdAt;

private UUID idUser;

public UUID getId() {
    return id;
}

public void setId(UUID id) {
    this.id = id;
}

public String getDescription() {
    return description;
}

public void setDescription(String description) {
    this.description = description;
}

public String getTitle() {
    return title;
}

public void setTitle(String title) {
    this.title = title;
}

public LocalDateTime getStartAt() {
    return startAt;
}

public void setStartAt(LocalDateTime startAt) {
    this.startAt = startAt;
}

public LocalDateTime getEndtAt() {
    return endtAt;
}

public void setEndtAt(LocalDateTime endtAt) {
    this.endtAt = endtAt;
}

public String getPrioroty() {
    return prioroty;
}

public void setPrioroty(String prioroty) {
    this.prioroty = prioroty;
}

public LocalDateTime getCreatedAt() {
    return createdAt;
}

public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
}

public UUID getIdUser() {
    return idUser;
}

public void setIdUser(UUID idUser) {
    this.idUser = idUser;
}


}

package com.jestec.todolist.entities;

import java.util.UUID;

import org.hibernate.annotations.CurrentTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "tb_users")
public class UserModel {


@Id 
@GeneratedValue(generator = "UUID")
private UUID id;

@CurrentTimestamp
private String createAt;

@Column(unique = true)
private String username;

private String nome;
private String email;
private String password;
public UUID getId() {
    return id;
}
public void setId(UUID id) {
    this.id = id;
}
public String getCreateAt() {
    return createAt;
}
public void setCreateAt(String createAt) {
    this.createAt = createAt;
}
public String getUsername() {
    return username;
}
public void setUsername(String username) {
    this.username = username;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getPassword() {
    return password;
}
public void setPassword(String password) {
    this.password = password;
}

@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserModel other = (UserModel) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
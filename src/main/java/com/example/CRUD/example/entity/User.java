package com.example.CRUD.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;
    public Long getId() {
        return id;
    }

    // Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for username
    public String getUsername() {
        return username;
    }
    // Getter for email
    public String getEmail() {
        return email;
    }
    // Setter for email
    public void setEmail(String email)
    {
        this.email = email;
    }


    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }
}

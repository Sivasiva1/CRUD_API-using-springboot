package com.example.CRUD.example.service;

import com.example.CRUD.example.entity.User;
import com.example.CRUD.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()) {
            throw new RuntimeException("User not found");
        }
        return user.get();
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User updateUser(User user) {
        Optional<User> dbUser = userRepository.findById(user.getId());
        if (dbUser.isEmpty()) {
            throw new RuntimeException("User not found");
        }
        User existingUser = dbUser.get();
        existingUser.setUsername(user.getUsername());
        existingUser.setEmail(user.getEmail());
        return userRepository.save(existingUser);
    }

    public void deleteUser(Long id) {
        Optional<User> dbUser = userRepository.findById(id);
        if (dbUser.isEmpty()) {
            throw new RuntimeException("User not found");
        }
        userRepository.delete(dbUser.get());
    }
}

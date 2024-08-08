package com.example.CRUD.example.repository;

import com.example.CRUD.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {


}

// work flow : entity ---> controller ---> service --->repository --- > postman ---> db
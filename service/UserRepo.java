package com.springboot.SpringBootrest.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.SpringBootrest.model.User;


public interface UserRepo extends JpaRepository<User, Integer>{
   com.springboot.SpringBootrest.model.User findByUserName(String username);
   
   


}

package com.example.userservice.service;

import com.example.userservice.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getOneUser(String id);
    User createUser(User u);
    boolean updateUser(String id, User u);
    boolean deleteUser(String id);
}

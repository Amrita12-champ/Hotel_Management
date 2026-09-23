package com.example.userservice.impl;

import com.example.userservice.entity.User;
import com.example.userservice.exception.UserNotFoundException;
import com.example.userservice.repository.UserRepo;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> getAllUser() {
       List <User> allUsers= userRepo.findAll();
       return allUsers;
    }

    @Override
    public User getOneUser(String id) {
       Optional<User> u =userRepo.findById(id);
        return u.orElseThrow(()->new UserNotFoundException("User not present in id :"+ id));
    }

    @Override
    public User createUser(User u) {
        User u1 =userRepo.save(u);
        return u1;
    }

    @Override
    public boolean updateUser(String id, User u) {
        return false;
    }

    @Override
    public boolean deleteStudent(String id) {
        return false;
    }
}

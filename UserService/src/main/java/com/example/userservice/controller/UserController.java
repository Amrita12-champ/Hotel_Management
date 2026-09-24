package com.example.userservice.controller;

import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepo;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService  ur;

    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAllUserDetails(){
        List<User> allUser=ur.getAllUser();
        return ResponseEntity.ok(allUser);
//        return ResponseEntity.status(HttpStatus.FOUND).body(allUser);
    }


    @PostMapping("/create")
    public ResponseEntity<User> create(@RequestBody User u){
        User u1=ur.createUser(u);
        return ResponseEntity.status(HttpStatus.CREATED).body(u1);
    }


    @GetMapping("/oneUser/{id}")
    public  ResponseEntity<User> oneUser(@PathVariable String id){
        User u1= ur.getOneUser(id);
        return ResponseEntity.ok(u1);
    }

    @PutMapping("/upadteUser/{id}")
    public String upadteUser(@PathVariable String id, @RequestBody User u1){
        boolean x = ur.updateUser(id,u1);
        if(x){
            return "Sucess";
        }
        return "Data not Found";
    }

    @DeleteMapping("/deleteUser/{id}")
    public boolean deleteUSer(@PathVariable String id){
        return ur.deleteUser(id);
    }


}

package com.geekster.validation.userManagementSystem.Controller;

import com.geekster.validation.userManagementSystem.Model.userModel;
import com.geekster.validation.userManagementSystem.Service.userService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class userController {

    @Autowired
    userService usersurvice;

    @PostMapping("/add")
    public String addUser(@Valid @RequestBody userModel usermodel){
        return usersurvice.addNewUser(usermodel);
    }

    @GetMapping("/show")
     public ArrayList<userModel>getAllUser(){
        return usersurvice.getAllUsers();
   }
   @GetMapping("getUser/{userId}")
    public userModel getUser(@PathVariable int userId){
        return usersurvice.getUserById(userId);
   }
   @PutMapping("/update/{userId}")
   public String updateUserInfo(@PathVariable int userId, @RequestBody userModel usermodel){
        return usersurvice.updateUser(userId,usermodel);

   }

   @DeleteMapping("/delete/{userId}")
   public String deleteUser(@PathVariable int userId){
        return usersurvice.deleteUserById(userId);
   }
}

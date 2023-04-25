package com.geekster.validation.userManagementSystem.Service;

import com.geekster.validation.userManagementSystem.Model.userModel;
import com.geekster.validation.userManagementSystem.Repository.userDau;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class userService {

    @Autowired
    userDau userdau;

    public String addNewUser(userModel usermodel){
        boolean status =userdau.save(usermodel);
        if(status){
            return "user added successfully....!!!!";
        }
        else{
            return "user not added successfully....!!!!";
        }
    }
    public ArrayList<userModel> getAllUsers(){
        return userDau.getUsers();
    }
    public userModel getUserById(int userId){
        ArrayList<userModel> helperlist =getAllUsers();
        userModel matchingUser=null;
        for(userModel user:helperlist){
            if(user.getUserId()==userId){
                matchingUser=user;
                break;
            }
        }
        return matchingUser;
    }
    public String updateUser(int userId, userModel usermodel){
        boolean updateStatus=userdau.updateUserById(userId,usermodel);

        if(updateStatus){
            return "userDetails updated successfully....!!!";
        }else{
            return "userDetails not updated successfully....!!!";
        }
    }
    public String deleteUserById(int userId){
        ArrayList<userModel> helperlist =getAllUsers();
        for(userModel user:helperlist){
            if(user.getUserId()==userId) {
                helperlist.remove(user);
                return "userId deleted successfully.....!!!";
            }
        }
        return "userId not deleted successfully.....!!!";
    }
}

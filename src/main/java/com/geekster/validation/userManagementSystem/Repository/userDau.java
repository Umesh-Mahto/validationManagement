package com.geekster.validation.userManagementSystem.Repository;


import com.geekster.validation.userManagementSystem.Model.userModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class userDau {

    static ArrayList<userModel> userlist=new ArrayList<>();

    public boolean save(userModel usermodel){
        userlist.add(usermodel);
        return true;
    }
  public static ArrayList<userModel> getUsers(){
        return userlist;
  }
  public boolean updateUserById(int userId, userModel usermodel){
        for(userModel userObj:userlist){
            if(userId==userObj.getUserId()){
                userObj.setUserId(usermodel.getUserId());
                userObj.setUserName(usermodel.getUserName());
                userObj.setDateOfBirth(usermodel.getDateOfBirth());
                userObj.setEmailId(usermodel.getEmailId());
                userObj.setPhoneNumber(usermodel.getPhoneNumber());
                userObj.setDate(usermodel.getDate());
                userObj.setTime(usermodel.getTime());
                return true;
            }
        }
        return false;
  }
}

package services;

import models.User;

public class AccountServices {
    
        public User login(String username, String password) {
        if((username.equals("Abe") || username.equals("Barb")) && password.equals("password")) {
            return new User(username, null); 
        } 
        return null; 
    }
}

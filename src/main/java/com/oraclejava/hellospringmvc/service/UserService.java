package com.oraclejava.hellospringmvc.service;

import com.oraclejava.hellospringmvc.model.User;

import java.util.List;

public interface UserService {
    public abstract void addUser(User user);
    public abstract User fetchUserById(int userId);
    public abstract void deleteUserById(int userId);
    public abstract void updateUserEmailById(String newMail, int userId);
    public abstract List<User> getAllUserInfo();
}

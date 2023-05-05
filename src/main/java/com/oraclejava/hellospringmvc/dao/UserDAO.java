package com.oraclejava.hellospringmvc.dao;

import com.oraclejava.hellospringmvc.model.User;

import java.util.List;

public interface UserDAO {
    public abstract void createUser(User user);
    public abstract User getUserById(int userId);
    public abstract void deleteUserById(int userId);
    public abstract void updateUserEmailById(String newMail, int userId);
    public abstract List<User> getAllUserDetails();

}

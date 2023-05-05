package com.oraclejava.hellospringmvc.service;

import com.oraclejava.hellospringmvc.dao.UserDAO;
import com.oraclejava.hellospringmvc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService{

    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void addUser(User user) {
        userDAO.createUser(user);
    }

    @Override
    public User fetchUserById(int userId) {
        return userDAO.getUserById(userId);
    }

    @Override
    public void deleteUserById(int userId) {
        userDAO.deleteUserById(userId);
    }

    @Override
    public void updateUserEmailById(String newMail, int userId) {
        userDAO.updateUserEmailById(newMail, userId);
    }

    @Override
    public List<User> getAllUserInfo() {
        return userDAO.getAllUserDetails();
    }
}

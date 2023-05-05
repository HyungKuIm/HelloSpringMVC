package com.oraclejava.hellospringmvc.dao;

import com.oraclejava.hellospringmvc.model.User;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserDAOImpl implements UserDAO{

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void createUser(User user) {
        String sql = "INSERT INTO users (first_name, last_name, email, password, created_by, created_at) " +
                "VALUES (?,?,?,?, 'admin', now())";
        jdbcTemplate.update(sql, user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());

    }

    @Override
    public User getUserById(int userId) {
        String sql = "select * from users where user_id = ?";
        User user = jdbcTemplate.queryForObject(sql, new UserRowMapper(), userId);
        return user;
    }

    @Override
    public void deleteUserById(int userId) {

    }

    @Override
    public void updateUserEmailById(String newMail, int userId) {

    }

    @Override
    public List<User> getAllUserDetails() {
        String sql = "select * from users order by user_id";
        List<User> users = jdbcTemplate.query(sql, new UserRowMapper());
        return users;
    }
}

package com.dao;

import com.model.User;

import java.util.List;

public interface UserDAO {

     List<User> getAllUsers();

     void saveUser(User user);

     void updateUser(User user, long id);

     User getUserById(long id);

     void deleteUser(long id);

     User getUserByName(String name);

}

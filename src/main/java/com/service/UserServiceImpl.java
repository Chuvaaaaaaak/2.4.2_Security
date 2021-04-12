package com.service;

import com.dao.UserDAO;
import com.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {


    private final UserDAO userDAO;



    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUsers() {

        return userDAO.getAllUsers();
    }


    @Override
    public void saveUser(User user) {
         userDAO.saveUser(user);
    }


    @Override
    public void updateUser(User user, long id) {
        userDAO.updateUser(user, id);
    }


    @Override
    public User getUserById(long id) {
        return userDAO.getUserById(id);
    }


    @Override
    public void deleteUser(long id) {
        userDAO.deleteUser(id);
    }

    @Override
    public User getUserByName(String username) {
        return userDAO.getUserByName(username);
    }


}

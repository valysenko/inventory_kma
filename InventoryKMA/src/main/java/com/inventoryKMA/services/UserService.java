package com.inventoryKMA.services;

import com.inventoryKMA.DAO.UserDAOInterface;
import com.inventoryKMA.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Vladyslav on 22.04.2015.
 */
@Transactional
public class UserService implements UserServiceInterface{

    @Autowired
    private UserDAOInterface userDAO;

    @Override
    public List<User> getUsersByRoleName(String name) {
        return userDAO.getUsersByRoleName(name);
    }
    public User getUserById(Integer id){
        return userDAO.getUserById(id);
    }
}

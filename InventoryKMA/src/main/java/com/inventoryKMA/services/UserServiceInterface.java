package com.inventoryKMA.services;

import com.inventoryKMA.entities.User;
import org.springframework.transaction.annotation.Transactional;

import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created by Vladyslav on 22.04.2015.
 */
@Transactional
public interface UserServiceInterface {
    public List<User> getUsersByRoleName(String name);
    public User getUserById(Integer id);
    public void deleteUser(int id);
    public User getUserByEmail(String email);
    public  void addUser(User user) throws NoSuchAlgorithmException;

    public void saveUser(User user)  throws NoSuchAlgorithmException;
}

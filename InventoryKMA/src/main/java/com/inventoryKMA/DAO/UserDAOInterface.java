package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Task;
import com.inventoryKMA.entities.User;

import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created by Vladyslav on 14.04.2015.
 */
public interface UserDAOInterface {
    public void addUser(User user) throws NoSuchAlgorithmException;

    public User getUserById(int id);

    public void deleteUser(int id);

    public List getUsers();

    public User getUserByEmail(String email);

    public List<User> getUsersByRoleName(String name);

    public void saveUser(User user)  throws NoSuchAlgorithmException;
}

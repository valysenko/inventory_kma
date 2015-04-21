package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Task;
import com.inventoryKMA.entities.User;

import java.util.List;

/**
 * Created by Vladyslav on 14.04.2015.
 */
public interface UserDAOInterface {
    public void addUser(User user);

    public Task getUserById(int id);

    public void deleteUser(User user);

    public List getUsers();

    public User getUserByEmail(String email);
}

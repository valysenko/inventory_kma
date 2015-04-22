package com.inventoryKMA.services;

import com.inventoryKMA.entities.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Vladyslav on 22.04.2015.
 */
@Transactional
public interface UserServiceInterface {
    public List<User> getUsersByRoleName(String name);
    public User getUserById(Integer id);
}

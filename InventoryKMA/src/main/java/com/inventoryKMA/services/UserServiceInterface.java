package com.inventoryKMA.services;

import java.util.List;

import com.inventoryKMA.entities.User;

public interface UserServiceInterface {
	public void addUser(int id);
	public void deleteUser(int id);
	public List<User> getUsers();
}

package com.inventoryKMA.services;

import java.util.ArrayList;

import com.inventoryKMA.entities.Category;

public interface CategoryServiceInterface {
	public void addCategory(int id);
	public void deleteCategory(int id);
	public ArrayList<Category> getCategories();
}

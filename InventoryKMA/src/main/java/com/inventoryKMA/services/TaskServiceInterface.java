package com.inventoryKMA.services;

import com.inventoryKMA.entities.Task;

public interface TaskServiceInterface {
    public void addTask(Task task);
    public Task getTaskById(int id);
    public void saveTask(Task task);
}

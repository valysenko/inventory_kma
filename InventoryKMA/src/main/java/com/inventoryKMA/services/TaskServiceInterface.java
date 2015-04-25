package com.inventoryKMA.services;

import com.inventoryKMA.entities.Task;

import java.util.List;

public interface TaskServiceInterface {
    public void addTask(String email,Task task);
    public Task getTaskById(int id);
    public void saveTask(Task task);
    public List<Task> getTasksOfUser(String email);
    public  void finishTask(int id);
    public  List<Task> getUnmanagedTasks();
}

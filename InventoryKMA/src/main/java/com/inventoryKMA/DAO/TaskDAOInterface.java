package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Task;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Vladyslav on 03.03.2015.
 */

@Repository
public interface TaskDAOInterface {
    public void addTask(String email,Task task);

    public Task getTaskById(int id);

    public void saveTask(Task task);

    public List<Task> getTasksOfUser(String email);

    public void finishTask(int id);

    public  List<Task> getUnmanagedTasks();
}

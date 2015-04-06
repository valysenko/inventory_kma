package com.inventoryKMA.services;

import com.inventoryKMA.DAO.TaskDAOInterface;
import com.inventoryKMA.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Vladyslav on 03.03.2015.
 */
@Transactional
public class TaskService  implements TaskServiceInterface{

    @Autowired
    private TaskDAOInterface taskDAO;

    @Override
    public void addTask(Task task) {
        taskDAO.addTask(task);
        System.out.println("task added to db");
    }

    @Override
    public Task getTaskById(int id) {
        return taskDAO.getTaskById(id);
    }

    @Override
    public void saveTask(Task task) {
        taskDAO.saveTask(task);
    }

}

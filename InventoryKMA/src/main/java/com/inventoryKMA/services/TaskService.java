package com.inventoryKMA.services;

import com.inventoryKMA.DAO.TaskDAOInterface;
import com.inventoryKMA.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Vladyslav on 03.03.2015.
 */
@Transactional
public class TaskService  implements TaskServiceInterface{

    @Autowired
    private TaskDAOInterface taskDAO;

    @Override
    public void addTask(String email,Task task) {
        taskDAO.addTask(email, task);
    }
    @Override
    public  void finishTask(int id){
        taskDAO.finishTask(id);
    }
//
    @Override
    public Task getTaskById(int id) {
        return taskDAO.getTaskById(id);
    }

    @Override
    public void saveTask(Task task) {
        taskDAO.saveTask(task);
    }

    @Override
    public List<Task> getTasksOfUser(String email){
        return taskDAO.getTasksOfUser(email);
    }

    @Override public  List<Task> getUnmanagedTasks(){
        return taskDAO.getUnmanagedTasks();
    }

}

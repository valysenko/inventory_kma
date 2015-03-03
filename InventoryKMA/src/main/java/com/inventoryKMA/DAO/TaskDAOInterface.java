package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Task;
import org.springframework.stereotype.Repository;

/**
 * Created by Vladyslav on 03.03.2015.
 */

@Repository
public interface TaskDAOInterface {
    public void addTask(Task task);

    public Task getTaskById(int id);

    public void saveTask(Task task);
}

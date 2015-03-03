package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Task;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Vladyslav on 03.03.2015.
 */
@Repository
public class TaskDAO implements TaskDAOInterface {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }


    @Override
    public void addTask(Task task) {
        currentSession().save(task);
    }

    @Override
    public Task getTaskById(int id) {
        return (Task) currentSession().get(Task.class, id);
    }

    @Override
    public void saveTask(Task task) {
        currentSession().update(task);
    }
}

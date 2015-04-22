package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Task;
import com.inventoryKMA.entities.User;
import com.inventoryKMA.services.EmailSenderService;
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

    @Autowired
    private UserDAO userDao;

    @Autowired
    private EmailSenderService emailSenderService;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }


    @Override
    public void addTask(String email,Task task) {
        User user = userDao.getUserByEmail(email);
        task.setStatus("in progress");
        task.setUserFrom(user);

        currentSession().save(task);

        //sending an email
        emailSenderService.sendMail("inventorykma@gmail.com",
                task.getUserTo().getEmail(),
                "A new task for you",
                task.getMessage());
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

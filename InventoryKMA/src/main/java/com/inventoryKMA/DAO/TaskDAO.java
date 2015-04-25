package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Task;
import com.inventoryKMA.entities.User;
import com.inventoryKMA.services.EmailSenderService;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

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
        String message = task.getMessage();
       String html = "<div style='height:120px;width:320px;\n" +
               "background-color:#3333FF; color:white; font-size:35px;\n" +
               "display:table-cell;vertical-align:bottom;'>\n" +
               " NaUKMA</div>\n" +
               "<div style='background-color:floralwhite;text-align:left;padding-left:5px;color:#000000;width:313px; height:150px;\n" +
               "border-bottom:3px solid #3366FF;\n" +
               "border-left: 1px dotted #3366FF;\n" +
               "border-right: 1px dotted #3366FF;'><br>"+message+"<br><br>\n" +
               "</div> ";
        //sending an email
        emailSenderService.sendMail("inventorykma@gmail.com",
                task.getUserTo().getEmail(),
                "A new task for you",html);
    }

    @Override
    public List<Task> getTasksOfUser(String email) {
        User user = userDao.getUserByEmail(email);

        List<Task> taskList = new ArrayList<Task>();
        Query query = currentSession().createQuery("from task t where t.userTo = :user");
        query.setParameter("user", user);
        taskList = query.list();
        return taskList;
    }

    @Override
    public void finishTask(int id){
        Task task = getTaskById(id);
        task.setStatus("finished");
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
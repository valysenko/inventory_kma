package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Task;
import com.inventoryKMA.entities.User;
import com.inventoryKMA.services.UserServiceInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Query;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vladyslav on 14.04.2015.
 */
@Repository
public class UserDAO implements UserDAOInterface{

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addUser(User user) {
        currentSession().save(user);
    }

    @Override
    public Task getUserById(int id) {
        return null;
    }


    @Override
    public void deleteUser(User user) {

    }

    @Override
    public User getUserByEmail(String email) {
        List<User> userList = new ArrayList<User>();
        Query query = currentSession().createQuery("from User u where u.email = :email");
        query.setParameter("email", email);
        userList = query.list();
        if (userList.size() > 0)
            return userList.get(0);
        else
            return null;
    }

    public List getUsers(){
        String hql = "FROM User";
        return currentSession().createQuery(hql)
                .list();
//        return null;
    }

}

package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Classroom;
import com.inventoryKMA.entities.Role;
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

    @Autowired
    private RoleDAOInterface roleDAO;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addUser(User user) {
        currentSession().save(user);
    }

    @Override
    public User getUserById(int id) {
        List<User> userList = new ArrayList<User>();
        Query query = currentSession().createQuery("from User u where u.id = :id");
        query.setParameter("id", id);
        userList = query.list();
        if (userList.size() > 0)
            return userList.get(0);
        else
            return null;
    }


    @Override
    public void deleteUser(int id) {

        //method not actually deleates user, it changes role from ROLE_ASSISTANT to ROLE_USER

            User user = (User) currentSession().load(User.class,id);//getUserById(id);
            Role role = roleDAO.getRoleByName("ROLE_USER");
            user.setRole(role);
            for(Classroom classroom :user.getClassrooms()){
                classroom.setUser(null);
            }
            for(Task task : user.getTasks()){
                task.setUserTo(null);
            }
            currentSession().save(user);


           // currentSession().flush();

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
    }

    public List<User> getUsersByRoleName(String name){
        List<User> usersList = new ArrayList<User>();

        Query query = currentSession().createQuery("select u from User as u " +
                "join u.role as roles " +
                "with  roles.role = :name  ");

        query.setParameter("name", name);
        usersList = query.list();
        return usersList;
    }

}

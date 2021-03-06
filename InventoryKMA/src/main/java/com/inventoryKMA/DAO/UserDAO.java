package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Classroom;
import com.inventoryKMA.entities.Role;
import com.inventoryKMA.entities.Task;
import com.inventoryKMA.entities.User;
import com.inventoryKMA.services.UserServiceInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Repository;
import org.hibernate.Query;
import java.security.*;

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
    public void addUser(User user) throws NoSuchAlgorithmException{
        Role role = roleDAO.getRoleByName("ROLE_USER");
        user.setRole(role);
        user.setPassword(toMD5(user.getPassword()));
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

    public void saveUser(User user)  throws NoSuchAlgorithmException{
        User u = (User) currentSession().load(User.class,user.getId());

        u.setLastName(user.getLastName());
        u.setFirstName(user.getFirstName());
        u.setPassword(toMD5(user.getPassword()));
        u.setEmail(user.getEmail());
        u.setPhoneNumber(user.getPhoneNumber());
        currentSession().save(u);
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

    @Override
    public List<User> getUsersByEmail(String email){
        List<User> userList = new ArrayList<User>();
        Query query = currentSession().createQuery("from User u where u.email like '"+email+"%'");
        userList = query.list();
        return userList;
    }

    private String toMD5(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());

        byte byteData[] = md.digest();


        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }

        return sb.toString();
    }

    @Override
    public void changeRoleToAssistant(Integer id){
        User user = (User) currentSession().load(User.class,id);
        Role role = roleDAO.getRoleByName("ROLE_ASSISTANT");
        user.setRole(role);
        currentSession().update(user);
    }

}

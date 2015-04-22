package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Role;
import com.inventoryKMA.entities.User;
import com.inventoryKMA.services.EmailSenderService;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vladyslav on 22.04.2015.
 */

@Repository
public class RoleDAO implements RoleDAOInterface{

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }


    @Override
    public Role getRoleByName(String name) {
        List<Role> roleList = new ArrayList<Role>();
        Query query = currentSession().createQuery("from Role r where r.role = :name");
        query.setParameter("name", name);
        roleList = query.list();
        if (roleList.size() > 0)
            return roleList.get(0);
        else
            return null;
    }
}

package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.User;
import com.inventoryKMA.entities.Workplace;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vladyslav on 23.04.2015.
 */
@Repository
public class WorkplaceDAO implements WorkplaceDAOInterface {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addWorkspace(Workplace workplace) {
        currentSession().save(workplace);
    }

    @Override
    public Workplace geWorkplaceById(int id) {
        List<Workplace> userList = new ArrayList<Workplace>();
        Query query = currentSession().createQuery("from Workplace w where w.id = :id");
        query.setParameter("id", id);
        userList = query.list();
        if (userList.size() > 0)
            return userList.get(0);
        else
            return null;
    }
}

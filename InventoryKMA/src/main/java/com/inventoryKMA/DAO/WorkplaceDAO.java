package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Workplace;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}

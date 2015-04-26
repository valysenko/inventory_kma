package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Complaint;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * Created by Valentyn on 26.04.2015.
 */
@Repository
public class ComplaintDAO implements ComplaintDAOInterface {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addComplaint(Complaint complaint){
        currentSession().save(complaint);

    }

}

package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Complaint;
import com.inventoryKMA.entities.Task;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


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
    @Override
    public  List<Complaint> getAllComplaint(){
        List<Complaint> complaintList = new ArrayList<Complaint>();
        Query query = currentSession().createQuery("from Complaint");
        complaintList = query.list();
        return complaintList;
    }

}

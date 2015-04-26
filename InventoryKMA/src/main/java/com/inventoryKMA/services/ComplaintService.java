package com.inventoryKMA.services;

import com.inventoryKMA.DAO.ComplaintDAO;
import com.inventoryKMA.DAO.ComplaintDAOInterface;
import com.inventoryKMA.entities.Complaint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Created by Valentyn on 26.04.2015.
 */


@Transactional
public class ComplaintService implements ComplaintServiceInterface {

    @Autowired
private ComplaintDAOInterface complaintDAO;

  @Override
    public void addComplaint(Complaint complaint){
      complaintDAO.addComplaint(complaint);
    }

    @Override public  List<Complaint> getAllComplaint(){
        return complaintDAO.getAllComplaint();
    }

}

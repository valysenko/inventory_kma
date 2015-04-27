package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Complaint;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Created by Valentyn on 26.04.2015.
 */

@Repository
public interface ComplaintDAOInterface {
    public void addComplaint(Complaint complaint);
    public List<Complaint> getAllComplaint();
    public void deleteComplaint (int id);
}

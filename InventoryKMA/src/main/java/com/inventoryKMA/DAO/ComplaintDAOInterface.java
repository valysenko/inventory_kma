package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Complaint;
import org.springframework.stereotype.Repository;

/**
 * Created by Valentyn on 26.04.2015.
 */

@Repository
public interface ComplaintDAOInterface {

    public void addComplaint(Complaint complaint);
}

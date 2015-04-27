package com.inventoryKMA.services;

import com.inventoryKMA.entities.Complaint;
import java.util.List;
/**
 * Created by Valentyn on 26.04.2015.
 */
public interface ComplaintServiceInterface {
    public void addComplaint(Complaint complain);
    public List<Complaint> getAllComplaint();
    public  void deleteComplaint(int id);

}

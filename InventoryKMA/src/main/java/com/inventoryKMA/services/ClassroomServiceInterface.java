package com.inventoryKMA.services;

import java.util.ArrayList;
import java.util.List;

import com.inventoryKMA.entities.Classroom;

public interface ClassroomServiceInterface {
    public void addClassrom(Classroom classroom);

    public List<Classroom> getAllClassrooms();

    public Classroom getClassroomByNumber(String number);
}

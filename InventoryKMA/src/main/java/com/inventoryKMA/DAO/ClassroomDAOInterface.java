package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Classroom;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Vladyslav on 23.04.2015.
 */

@Repository
public interface ClassroomDAOInterface {
    public void addClassroom(Classroom classroom);

    public List<Classroom> getAllClassrooms();

    public Classroom getClassroomByNumber(String number);
}

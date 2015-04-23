package com.inventoryKMA.services;

import com.inventoryKMA.DAO.ClassroomDAOInterface;
import com.inventoryKMA.entities.Classroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Vladyslav on 23.04.2015.
 */
@Transactional
public class ClassroomService implements ClassroomServiceInterface{

    @Autowired
    private ClassroomDAOInterface classroomDAO;

    public void addClassrom(Classroom classroom){
        classroomDAO.addClassroom(classroom);
    }

}
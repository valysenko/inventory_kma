package com.inventoryKMA.services;

import com.inventoryKMA.DAO.ClassroomDAOInterface;
import com.inventoryKMA.entities.Classroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public List<Classroom> getAllClassrooms() {
        return classroomDAO.getAllClassrooms();
    }

    @Override
    public Classroom getClassroomByNumber(String number) {
        return classroomDAO.getClassroomByNumber(number);
    }

    @Override
    public List<Classroom> getUnmanagedClassrooms(){
        return classroomDAO.getUnmanagedClassrooms();
    }

    @Override
    public void saveClassroom(Classroom classroom){
        classroomDAO.saveClassroom(classroom);
    }
}

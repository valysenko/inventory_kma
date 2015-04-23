package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Classroom;
import com.inventoryKMA.entities.Workplace;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Vladyslav on 23.04.2015.
 */

@Repository
public class ClassroomDAO implements ClassroomDAOInterface{

    @Autowired
    private WorkplaceDAOInterface workplaceDAO;

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void addClassroom(Classroom classroom){
        currentSession().save(classroom);
        //creating workplaces for this classroom
        for(int i=0;i<classroom.getRows()*classroom.getColumns();i++){
            Workplace workplace = new Workplace(i+1);
            workplace.setClassroom(classroom);
            workplaceDAO.addWorkspace(workplace);
        }currentSession().save(classroom);
    }
}

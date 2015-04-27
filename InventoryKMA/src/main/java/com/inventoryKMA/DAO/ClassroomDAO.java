package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Classroom;
import com.inventoryKMA.entities.User;
import com.inventoryKMA.entities.Workplace;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Classroom> getAllClassrooms() {
        List<Classroom> classroomList = new ArrayList<Classroom>();
        Query query = currentSession().createQuery("from Classroom");
        classroomList = query.list();
        return classroomList;
    }

    @Override
    public Classroom getClassroomByNumber(String number) {
        List<Classroom> classroomList = new ArrayList<Classroom>();
        Query query = currentSession().createQuery("from Classroom cl where cl.number = :number");
        query.setParameter("number", number);
        classroomList = query.list();
        if (classroomList.size() > 0)
            return classroomList.get(0);
        else
            return null;
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

    public  List<Classroom> getUnmanagedClassrooms(){
        List<Classroom> classroomList = new ArrayList<Classroom>();
        Query query = currentSession().createQuery("from Classroom cl where cl.user is EMPTY ");
        classroomList = query.list();
        return classroomList;
    }

    public void saveClassroom(Classroom classroom){
        Classroom cl = (Classroom) currentSession().load(Classroom.class,classroom.getId());
        cl.setUser(classroom.getUser());
        currentSession().save(cl);
    }
    public void changeUserInClassroom(Integer id){
        Classroom cl = (Classroom) currentSession().load(Classroom.class,id);
        cl.setUser(null);
        currentSession().save(cl);
    }
}

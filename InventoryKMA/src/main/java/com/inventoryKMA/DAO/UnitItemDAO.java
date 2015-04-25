package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Unit;
import com.inventoryKMA.entities.UnitItem;
import com.inventoryKMA.entities.Workplace;
import com.inventoryKMA.services.EmailSenderService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Vladyslav on 24.04.2015.
 */
@Repository
public class UnitItemDAO implements UnitItemDAOInterface{

    @Autowired
    private UnitDAOInterface unitDAO;

    @Autowired
    private WorkplaceDAOInterface workplaceDAO;

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void addItem(UnitItem item, Integer workplaceId, String type){
        Unit unit = unitDAO.getUnitByName(type);
        Workplace wP = workplaceDAO.geWorkplaceById(workplaceId);
        item.setWorkplace(wP);
        item.setUnit(unit);
        currentSession().save(item);
    }

}

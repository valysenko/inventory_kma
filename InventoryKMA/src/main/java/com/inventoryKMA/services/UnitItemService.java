package com.inventoryKMA.services;

import com.inventoryKMA.DAO.UnitDAOInterface;
import com.inventoryKMA.DAO.UnitItemDAOInterface;
import com.inventoryKMA.entities.Unit;
import com.inventoryKMA.entities.UnitItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Vladyslav on 24.04.2015.
 */

@Transactional
public class UnitItemService implements UnitItemServiceInterface{

    @Autowired
    private UnitItemDAOInterface unitItemDAO;

    @Override
    public void addItem(UnitItem item,Integer workplaceId,String type) {

        unitItemDAO.addItem(item,workplaceId,type);
    }

    @Override
    public void deleteUnitItem(Integer id){
        unitItemDAO.deleteUnitItem(id);
    }
}

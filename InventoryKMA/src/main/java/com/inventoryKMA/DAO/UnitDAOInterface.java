package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Unit;

public interface UnitDAOInterface {
    public void addUnit(Unit unit);

    public Unit getUnit(int id);
}

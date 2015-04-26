package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.UnitItem;
import org.springframework.stereotype.Repository;

/**
 * Created by Vladyslav on 24.04.2015.
 */

@Repository
public interface UnitItemDAOInterface {
    public void addItem(UnitItem item, Integer workplaceId, String type);

    public void deleteUnitItem(Integer id);
}

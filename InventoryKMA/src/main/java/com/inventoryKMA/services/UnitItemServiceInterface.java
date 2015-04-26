package com.inventoryKMA.services;

import com.inventoryKMA.entities.UnitItem;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Vladyslav on 24.04.2015.
 */

@Transactional
public interface UnitItemServiceInterface {
    public void addItem(UnitItem item,Integer workplaceId,String type);

    public void deleteUnitItem(Integer id);
}

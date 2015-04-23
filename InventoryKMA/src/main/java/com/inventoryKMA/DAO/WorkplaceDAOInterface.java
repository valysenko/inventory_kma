package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Workplace;
import org.springframework.stereotype.Repository;

/**
 * Created by Vladyslav on 23.04.2015.
 */

@Repository
public interface WorkplaceDAOInterface {
    public void addWorkspace(Workplace workplace);
}

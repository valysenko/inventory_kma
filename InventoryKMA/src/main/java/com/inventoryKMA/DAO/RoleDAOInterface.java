package com.inventoryKMA.DAO;

import com.inventoryKMA.entities.Role;
import org.springframework.stereotype.Repository;

/**
 * Created by Vladyslav on 22.04.2015.
 */

@Repository
public interface RoleDAOInterface {
    public Role getRoleByName(String name);
}

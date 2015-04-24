package com.inventoryKMA;

import com.inventoryKMA.entities.Task;
import com.inventoryKMA.entities.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Vladyslav on 24.04.2015.
 */

@Controller
public class UnitItemController {

    @RequestMapping("/admin/item/new")
    public String addTaskShowUnitItemShow(ModelMap model){

        return "task";
    }



}

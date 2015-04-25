package com.inventoryKMA;

import com.inventoryKMA.services.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Vladyslav on 25.04.2015.
 */

@Controller
public class UserController {

    @Autowired
    private UserServiceInterface userService;

    @RequestMapping(value = "/admin/assistant/list", method = RequestMethod.GET)
    public String assistantList(ModelMap model) {

        model.addAttribute("assistants", userService.getUsersByRoleName("ROLE_ASSISTANT"));
        return "assistantList";
    }

    @RequestMapping(value = "/admin/assistant/delete/{id}", method = RequestMethod.GET)
    public String deleteAssistant(ModelMap model,@PathVariable int id) {

        //model.addAttribute("assistants", userService.getUsersByRoleName("ROLE_ASSISTANT"));
        userService.deleteUser(id);
        return "redirect:/admin/assistant/list";
    }



}

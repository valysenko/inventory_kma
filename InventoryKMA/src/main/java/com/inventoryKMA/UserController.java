package com.inventoryKMA;

import com.inventoryKMA.entities.Classroom;
import com.inventoryKMA.entities.Role;
import com.inventoryKMA.entities.Task;
import com.inventoryKMA.entities.User;
import com.inventoryKMA.services.UserServiceInterface;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @RequestMapping(value = "/admin/assistant/new", method = RequestMethod.GET)
    public String userList(ModelMap model) {

        model.addAttribute("users", userService.getUsersByRoleName("ROLE_USER"));
        return "userList";
    }

    @RequestMapping(value = "/admin/assistant/delete/{id}", method = RequestMethod.GET)
    public String deleteAssistant(ModelMap model,@PathVariable int id) {

        //model.addAttribute("assistants", userService.getUsersByRoleName("ROLE_ASSISTANT"));
        userService.deleteUser(id);
        return "redirect:/admin/assistant/list";
    }

    @RequestMapping(value = "/edit/user", method = RequestMethod.GET)
    public String editUserShow(ModelMap model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String email = auth.getName(); //get logged in email
        User user = userService.getUserByEmail(email);
        model.addAttribute("user",user);
        return "editUser";
    }

    @RequestMapping(value = "/edit/user/save", method = RequestMethod.POST)
    public String editUserSave(ModelMap model,@Valid @ModelAttribute("user") User user,
                                     BindingResult result)  throws NoSuchAlgorithmException {
        if(result.hasErrors()){
            return "editUser";
        }

       userService.saveUser(user);
        return "redirect:/index";
    }

    @RequestMapping(value = "/admin/find/user", method = RequestMethod.GET)
    public String findUser(ModelMap model) {
        return "findUser";
    }

    @RequestMapping(value = "/admin/find/user/{email}",
            method = RequestMethod.GET,
            produces = "application/json",
            headers="Accept=*/*")
    public @ResponseBody
    List<User> findUserValue(ModelMap model,@PathVariable String email)   {

        //need it for avoiding problems with json
        List<Task> tL = new ArrayList<Task>();
        Set<Classroom> cL = new HashSet<Classroom>();
        Role r = new Role();

        List<User> userList= userService.getUsersByEmail(email);

        for(User u : userList){
            u.setTasks(tL);
            u.setClassrooms(cL);
            u.setRole(r);
        }

        return userList;
    }

    @RequestMapping(value = "/admin/change/role/{id}", method = RequestMethod.GET)
    public String changeRoleToAssistant(ModelMap model,@PathVariable Integer id )  {

        userService.changeRoleToAssistant(id);
        return "redirect:/index";
    }


}

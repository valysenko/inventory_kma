package com.inventoryKMA;

import com.inventoryKMA.entities.Task;
import com.inventoryKMA.entities.User;
import com.inventoryKMA.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.AuthenticationUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Vladyslav on 06.04.2015.
 */

@Controller
@RequestMapping("/admin/task")
public class TaskController {

    @Autowired
    private TaskServiceInterface taskService;

    @Autowired
    private UserServiceInterface userService;

    @Autowired
    private UserEditor userEditor;

    /*
    need for converting string to user when form is  submited
    http://stackoverflow.com/questions/12875299/spring-mvc-formselect-tag
    */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(User.class, this.userEditor);
    }

    @RequestMapping("/new")
    public String addTaskShow(ModelMap model){

        model.addAttribute("task",new Task());
        List<User> users = userService.getUsersByRoleName("ROLE_ASSISTANT");
        model.addAttribute("users",users);

        return "task";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST,name = "add")
    public String addTask(@ModelAttribute("task") Task task,
                          BindingResult result) {
//        //logged in user
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String email = auth.getName(); //get logged in email

        taskService.addTask(email,task);

        return "redirect:/";
    }

}

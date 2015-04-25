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
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Vladyslav on 06.04.2015.
 */

@Controller
@RequestMapping("/")
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

    @RequestMapping("/admin/task/new")
    public String addTaskShow(ModelMap model){

        model.addAttribute("task",new Task());
        List<User> users = userService.getUsersByRoleName("ROLE_ASSISTANT");
        model.addAttribute("users",users);

        return "task";
    }

    @RequestMapping(value = "/admin/task/add", method = RequestMethod.POST,name = "add")
    public String addTask(ModelMap model, @Valid @ModelAttribute("task") Task task,
                          BindingResult result) {
        if(result.hasErrors()){
            List<User> users = userService.getUsersByRoleName("ROLE_ASSISTANT");
            model.addAttribute("users",users);
            return "task";
        }

//        //logged in user
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String email = auth.getName(); //get logged in email

        taskService.addTask(email,task);

        return "redirect:/";
    }

    @RequestMapping(value = "/assistant/tasks", method = RequestMethod.GET)
    public String getAssistantTasks(ModelMap model) {

       //logged in user
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String email = auth.getName(); //get logged in email

        model.addAttribute("tasks",taskService.getTasksOfUser(email));
        return "taskList";
    }

    @RequestMapping(value = "/admin/task/unmanaged/list", method = RequestMethod.GET)
    public String unmanagedTasksList(ModelMap model) {

        model.addAttribute("tasks",taskService.getUnmanagedTasks());
        return "unmanagedTaskList";
    }

    @RequestMapping(value = "/admin/task/manage/{id}", method = RequestMethod.GET)
    public String manageTask(ModelMap model,@PathVariable Integer id) {
        Task task = taskService.getTaskById(id);

        List<User> users = userService.getUsersByRoleName("ROLE_ASSISTANT");
        model.addAttribute("users",users);
        model.addAttribute("task", task);
        return "manageTask";
    }

    @RequestMapping(value = "/admin/task/save", method = RequestMethod.POST)
    public String manageClassroomSave(@ModelAttribute("task") Task task,
                                      BindingResult result) {
        taskService.saveTask(task);
        return "redirect:/admin/task/unmanaged/list";
    }


    @RequestMapping(value = "/assistant/task/finish/{id}", method = RequestMethod.GET)
     public String finishTask(ModelMap model,@PathVariable int id) {

        taskService.finishTask(id);
        return "redirect:/assistant/tasks";
    }

}

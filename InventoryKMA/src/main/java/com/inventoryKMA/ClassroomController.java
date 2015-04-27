package com.inventoryKMA;

import com.inventoryKMA.entities.Classroom;
import com.inventoryKMA.entities.Task;
import com.inventoryKMA.entities.User;
import com.inventoryKMA.services.ClassroomServiceInterface;
import com.inventoryKMA.services.UserEditor;
import com.inventoryKMA.services.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Vladyslav on 23.04.2015.
 */

@Controller
public class ClassroomController {

    @Autowired
    private ClassroomServiceInterface classroomService;

    @Autowired
    private UserServiceInterface userService;

    @Autowired
    private UserEditor userEditor;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(User.class, this.userEditor);
    }

    @RequestMapping(value="admin/classroom/new",method = RequestMethod.GET)
    public String addClassroomShow(ModelMap model) {

        List<User> users = userService.getUsersByRoleName("ROLE_ASSISTANT");
        model.addAttribute("users",users);
        model.addAttribute("classroom", new Classroom());
        return "classroom";
    }

    @RequestMapping(value="admin/classroom/add",method = RequestMethod.POST)
    public String addClassroom(ModelMap model,@ModelAttribute("classroom") @Valid Classroom classroom,
                               BindingResult result) {
        if (result.hasErrors()) {
            List<User> users = userService.getUsersByRoleName("ROLE_ASSISTANT");
            model.addAttribute("users",users);
            return "classroom";
        }

        classroomService.addClassrom(classroom);
        return "redirect:/admin/classroom/"+classroom.getNumber();
    }

    @RequestMapping(value = "/admin/classroom/list", method = RequestMethod.GET)
    public String classroomList(ModelMap model) {

        model.addAttribute("classrooms", classroomService.getAllClassrooms());
        return "classroomList";
    }

    @RequestMapping(value = "/admin/classroom/unmanaged/list", method = RequestMethod.GET)
     public String unmanagedClassroomList(ModelMap model) {

        model.addAttribute("classrooms", classroomService.getUnmanagedClassrooms());
        return "unmanagedClassroomList";
    }

    @RequestMapping(value = "/admin/classroom/manage/{number}", method = RequestMethod.GET)
    public String manageClassroom(ModelMap model,@PathVariable String number) {
        Classroom classroom = classroomService.getClassroomByNumber(number);

        List<User> users = userService.getUsersByRoleName("ROLE_ASSISTANT");
        model.addAttribute("users",users);
        model.addAttribute("classroom", classroom);
        return "manageClassroom";
    }

    @RequestMapping(value = "/admin/classroom/save", method = RequestMethod.POST)
     public String manageClassroomSave(@ModelAttribute("classroom") Classroom classroom,
                                       BindingResult result) {
        classroomService.saveClassroom(classroom);
        return "redirect:/admin/classroom/unmanaged/list";
    }
    @RequestMapping(value = "/admin/classroom/unmanage/{number}/{id}", method = RequestMethod.GET)
    public String changeUserInClassroom(ModelMap model, @PathVariable String number, @PathVariable Integer id) {

        classroomService.changeUserInClassroom(id);
        return "redirect:/admin/classroom/"+number;
    }

    @RequestMapping(value = "/admin/classroom/{number}", method = RequestMethod.GET)
    public String getClassroom(ModelMap model, @PathVariable String number) {
        Classroom classroom = classroomService.getClassroomByNumber(number);
        model.addAttribute("classroom", classroom);
        return "classroomEdit";
    }



}

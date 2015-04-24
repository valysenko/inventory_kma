package com.inventoryKMA;

import com.inventoryKMA.entities.Classroom;
import com.inventoryKMA.entities.Task;
import com.inventoryKMA.services.ClassroomServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by Vladyslav on 23.04.2015.
 */

@Controller
public class ClassroomController {

    @Autowired
    private ClassroomServiceInterface classroomService;

    @RequestMapping(value="admin/classroom/new",method = RequestMethod.GET)
    public String addClassroomShow(ModelMap model) {

        model.addAttribute("classroom",new Classroom());
        return "classroom";
    }

    @RequestMapping(value="admin/classroom/add",method = RequestMethod.POST)
    public String addClassroom(@ModelAttribute("classroom") @Valid Classroom classroom,
                               BindingResult result) {
        if (result.hasErrors()) {
            return "classroom";
        }

        classroomService.addClassrom(classroom);
        return "redirect:/";
    }

    @RequestMapping(value = "/admin/classroom/list", method = RequestMethod.GET)
    public String classroomList(ModelMap model) {

        model.addAttribute("classrooms", classroomService.getAllClassrooms());
        return "classroomList";
    }

    @RequestMapping(value = "/admin/classroom/{number}", method = RequestMethod.GET)
    public String getC(ModelMap model, @PathVariable String number) {
        Classroom classroom = classroomService.getClassroomByNumber(number);
        model.addAttribute("classroom", classroom);
        return "classroomEdit";
    }

}

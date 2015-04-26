package com.inventoryKMA;

import com.inventoryKMA.entities.Task;
import com.inventoryKMA.entities.User;
import com.inventoryKMA.services.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Vladyslav on 26.04.2015.
 */

@Controller
@RequestMapping("/")
public class RegistrationController {

    @Autowired
    private UserServiceInterface userService;

    @RequestMapping(value="/registration",method=RequestMethod.GET)
    public String registrationFormShow(ModelMap model){

        model.addAttribute("user",new User());
        return "userRegistration";
    }

    @RequestMapping(value = "/registration/add", method = RequestMethod.POST)
    public String registration(ModelMap model, @Valid @ModelAttribute("user") User user,
                          BindingResult result) {
        if(result.hasErrors()){
            return "userRegistration";
        }

        userService.addUser(user);

        return "redirect:/";
    }
}

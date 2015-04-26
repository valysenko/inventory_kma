package com.inventoryKMA;

/**
 * Created by Vladyslav on 19.04.2015.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView loginForm() {
        return new ModelAndView("login-page");
    }

    @RequestMapping(value = "/error-login", method = RequestMethod.GET)
    public ModelAndView invalidLogin() {
        ModelAndView modelAndView = new ModelAndView("login-page");
        modelAndView.addObject("error", true);
        return modelAndView;
    }

    @RequestMapping(value = "/error403", method = RequestMethod.GET)
    public String error403() {
        return "error403";
    }

}
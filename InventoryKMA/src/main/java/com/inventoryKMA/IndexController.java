package com.inventoryKMA;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Vladyslav on 21.04.2015.
 */

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String defaultAfterLogin(HttpServletRequest request) {
        if (request.isUserInRole("ROLE_ADMIN")) {
            return "redirect:/admin/cabinet";
        }
        else if (request.isUserInRole("ROLE_ASSISTANT")) {
            return "redirect:/assistant/cabinet";
        }
        return "redirect:/user/cabinet";
    }
}

package com.inventoryKMA;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Vladyslav on 19.04.2015.
 */

@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping(value="/cabinet", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        return "cabinet";
    }
}

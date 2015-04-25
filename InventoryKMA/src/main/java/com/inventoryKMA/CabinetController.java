package com.inventoryKMA;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Vladyslav on 22.04.2015.
 */

@Controller
public class CabinetController {

    @RequestMapping(value="/admin/cabinet", method = RequestMethod.GET)
    public String adminCabinet(ModelMap model) {

        return "cabinet";
    }

    @RequestMapping(value="/assistant/cabinet", method = RequestMethod.GET)
    public String assistantCabinet(ModelMap model) {

        return "cabinet";
    }

    @RequestMapping(value="/user/cabinet", method = RequestMethod.GET)
    public String userCabinet(ModelMap model) {

        return "redirect:/user/complaint/new";
    }


}

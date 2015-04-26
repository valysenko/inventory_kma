package com.inventoryKMA;

import com.inventoryKMA.entities.Complaint;
import com.inventoryKMA.entities.Task;
import com.inventoryKMA.services.ComplaintService;
import com.inventoryKMA.services.ComplaintServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Valentyn on 26.04.2015.
 */

@Controller
public class ComplainController {
  @Autowired
    private ComplaintServiceInterface complaintService;

    @RequestMapping(value="/user/complaint/new", method = RequestMethod.GET)
    public String addComplaintShow(ModelMap model) {
        model.addAttribute("complaint", new Complaint());

        return "complaint";
    }

    @RequestMapping(value="/user/complaint/add", method = RequestMethod.POST)
    public String addComplaintShow(ModelMap model,@ModelAttribute("complaint") Complaint complaint,
                                   BindingResult result) {
        complaintService.addComplaint(complaint);
        return "redirect:/user/cabinet";
    }


}



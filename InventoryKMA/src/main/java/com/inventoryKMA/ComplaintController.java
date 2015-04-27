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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Valentyn on 26.04.2015.
 */

@Controller
public class ComplaintController {
  @Autowired
    private ComplaintServiceInterface complaintService;

    @RequestMapping(value="/user/complaint/new", method = RequestMethod.GET)
    public String addComplaintShow(ModelMap model) {
        model.addAttribute("complaint", new Complaint());

        return "complaint";
    }

    @RequestMapping(value="/user/complaint/add", method = RequestMethod.POST)
    public String addComplaintShow(ModelMap model, @Valid @ModelAttribute("complaint") Complaint complaint,
                                   BindingResult result) {
        if (result.hasErrors()){
            return "complaint";
        }else {

            complaintService.addComplaint(complaint);
            return "redirect:/user/cabinet";
        }
    }
    @RequestMapping(value="/admin/complaint/delete/{id}", method = RequestMethod.GET)
    public String deleteComplaint(ModelMap model, @PathVariable int id) {
        complaintService.deleteComplaint(id);
        return "redirect:/admin/complaint/list";

    }




    @RequestMapping(value = "/admin/complaint/list", method = RequestMethod.GET)
    public String getAllComplaint(ModelMap model) {
        model.addAttribute("complaint",complaintService.getAllComplaint());
        return "complaintList";

    }


}



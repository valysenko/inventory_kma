package com.inventoryKMA;

import com.inventoryKMA.entities.Task;
import com.inventoryKMA.entities.UnitItem;
import com.inventoryKMA.entities.User;
import com.inventoryKMA.services.UnitItemServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Vladyslav on 24.04.2015.
 */

@Controller
@RequestMapping("/")
public class UnitItemController {

    @Autowired
    private UnitItemServiceInterface unitItemService;

    @RequestMapping(value="/admin/unit/new/{classroom_number}/{workplace_id}",method = RequestMethod.GET)
    public String addUnitItemShow(ModelMap model,@PathVariable String classroom_number,
                                  @PathVariable Integer workplace_id){

        model.addAttribute("item",new UnitItem());
        model.addAttribute("id",workplace_id);
        model.addAttribute("classroom_number",classroom_number);
        return "unitItem";
    }

    @RequestMapping(value="/admin/unit/add",method = RequestMethod.POST)
     public String addUnitItem(@RequestParam("type") String type,
                               @ModelAttribute("id") Integer id,
                               @ModelAttribute("classroom_number") String classroom_number,
                               @Valid @ModelAttribute("item")  UnitItem unitItem,
                               BindingResult result){
        if (result.hasErrors()) {
            return "unitItem";
        }

        unitItemService.addItem(unitItem,id,type);
        return "redirect:/admin/classroom/"+classroom_number;
    }

    @RequestMapping(value="/admin/unititem/delete/{classsroom_number}/{id}",method = RequestMethod.GET)
    public void /*String*/ deleteUnitItem(ModelMap model,@PathVariable Integer classsroom_number,@PathVariable Integer id){

        unitItemService.deleteUnitItem(id);
      //  return "redirect:/admin/classroom/"+classsroom_number;
    }
}

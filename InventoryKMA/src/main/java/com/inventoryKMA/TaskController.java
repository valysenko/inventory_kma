package com.inventoryKMA;

        import com.inventoryKMA.entities.Task;
        import com.inventoryKMA.entities.User;
        import com.inventoryKMA.services.TaskService;
        import com.inventoryKMA.services.TaskServiceInterface;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.ModelMap;
        import org.springframework.web.bind.annotation.ModelAttribute;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;

        import java.util.ArrayList;
        import java.util.List;


/**
 * Created by Vladyslav on 06.04.2015.
 */

@Controller
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskServiceInterface taskService;

    @RequestMapping("/add")
    public String addTaskShow(ModelMap model){
        List<User> users = new ArrayList<User>();
//        users.add(new User("Vlad","Lysenko"));
//        users.add(new User("Petro","Petrenko"));
        model.addAttribute("task",new Task());
        model.addAttribute("users",users);

        return "task";
    }

//    @RequestMapping(value="/add",method = RequestMethod.POST )
//    public String addTask(@ModelAttribute("book") Task task){
//        taskService.addTask(task);
//
//        return "redirect:/" ;
//    }

}

package com.inventoryKMA;

import com.inventoryKMA.entities.Task;
import com.inventoryKMA.entities.Unit;
import com.inventoryKMA.services.TaskService;
import com.inventoryKMA.services.TaskServiceInterface;
import com.inventoryKMA.services.UnitService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        UnitService service =
                (UnitService) context.getBean("unitService");

//        Unit unit = new Unit("mouse", "Msd743743");
//        service.addUnit(unit);

        TaskServiceInterface taskService = (TaskServiceInterface) context.getBean("taskService");
//        Task task = new Task("new","clear windows");
//        taskService.addTask(task);
//        Task get_task = taskService.getTaskById(1);
//        System.out.println(get_task.getId()+" "+get_task.getMessage()+" "+get_task.getStatus());
    }
}

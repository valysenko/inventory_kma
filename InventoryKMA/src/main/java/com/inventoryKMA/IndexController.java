package com.inventoryKMA;

import com.inventoryKMA.entities.Task;
import com.inventoryKMA.services.EmailSenderService;
import com.inventoryKMA.services.TaskService;
import com.inventoryKMA.services.TaskServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap model) {
		return "index";
	}

}
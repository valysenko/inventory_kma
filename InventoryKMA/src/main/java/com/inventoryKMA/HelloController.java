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
public class HelloController {

    @Autowired
    private TaskServiceInterface taskService;

    @Autowired
    private EmailSenderService emailSenderService;

    @RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
        // sends the e-mail
        emailSenderService.sendMail("inventorykma@gmail.com",
                "va_lysenko@ukr.net",
                "Subject - testing",
                "Testing only \n\n Hello Spring Email Sender");

        model.addAttribute("message", "Hello world!");
		return "hello";
	}
}
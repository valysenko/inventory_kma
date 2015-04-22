package com.inventoryKMA.services;

import com.inventoryKMA.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

/**
 * Created by Vladyslav on 22.04.2015.
 *
 need for converting string to user when form is  submited
 http://stackoverflow.com/questions/12875299/spring-mvc-formselect-tag
 */
@Component
public class UserEditor extends PropertyEditorSupport {
    private @Autowired
    UserServiceInterface userService;

    // Converts a String to a Country (when submitting form)
    @Override
    public void setAsText(String text) {
        User u = this.userService.getUserById(Integer.valueOf(text));

        this.setValue(u);
    }
}

package com.inventoryKMA.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Vladyslav on 25.04.2015.
 */

@Entity
@Table(name = "complaint")
public class Complaint {
    @Id
    @GeneratedValue
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @NotNull
    @Size(min=1)
    @Column(name = "message")
    private String message;
}

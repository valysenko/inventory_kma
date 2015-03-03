package com.inventoryKMA.entities;

import javax.persistence.*;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "status")
    private String status;

    @Column(name = "message")
    private String message;

//    private User userFrom;
//    private User userTo;

    public Task() {
    }

    public Task(String status, String message) {
        this.status = status;
        this.message = message;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    public User getUserFrom() {
//        return userFrom;
//    }
//    public void setUserFrom(User userFrom) {
//        this.userFrom = userFrom;
//    }
//    public User getUserTo() {
//        return userTo;
//    }
//    public void setUserTo(User userTo) {
//        this.userTo = userTo;
//    }


}

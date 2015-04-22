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

    public User getUserTo() {
        return userTo;
    }

    public void setUserTo(User userTo) {
        this.userTo = userTo;
    }

    @Column(name = "message")
    private String message;

    @ManyToOne
    @JoinColumn(name = "userTo_id")
    private User userTo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userFrom_id", nullable = false)
    private User userFrom;

    public Task() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
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

    public User getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(User userFrom) {
        this.userFrom = userFrom;
    }

}

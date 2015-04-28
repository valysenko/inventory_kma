package com.inventoryKMA.entities;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.IndexColumn;

import javax.persistence.*;
import java.util.List;
import javax.validation.constraints.*;
@Entity
@Table(name = "classroom")
public class Classroom {
    @Id
    @GeneratedValue
    private Integer id;

    @Min(1)
    @NotNull
    private Integer rows;

    @Min(1)
    @NotNull
    private Integer columns;

    @Size(min=1)
    @NotNull
    private String number;


    @OneToMany(mappedBy="classroom",fetch = FetchType.EAGER)
    private List<Workplace> workplaces;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = true)
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public List<Workplace> getWorkplaces() {
        return workplaces;
    }

    public void setWorkplaces(List<Workplace> workplaces) {
        this.workplaces = workplaces;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

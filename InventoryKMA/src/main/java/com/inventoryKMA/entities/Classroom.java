package com.inventoryKMA.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "classroom")
public class Classroom {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer rows;
    private Integer columns;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "classroom_id")
    private List<Workplace> workplaces;

    @ManyToMany(mappedBy = "classrooms")
     private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
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
}

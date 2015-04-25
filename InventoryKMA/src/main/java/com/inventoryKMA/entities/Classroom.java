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

//    @Fetch(FetchMode.SELECT)
    @OneToMany(mappedBy="classroom",fetch = FetchType.EAGER)
  //  @IndexColumn(name="classroom_id")
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

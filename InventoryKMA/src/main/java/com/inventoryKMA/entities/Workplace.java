package com.inventoryKMA.entities;

import org.hibernate.annotations.*;


import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "workplace")
public class Workplace {
    @Id
    @GeneratedValue
    private Integer id;

    private Integer sequenceNumber;

    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;

    public  Workplace(){

    }

    public Workplace(Integer sequenceNumber, List<UnitItem> units, Classroom classroom) {
        this.sequenceNumber = sequenceNumber;
        this.units = units;
        this.classroom = classroom;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public Workplace(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
//    ,fetch = FetchType.EAGER
   // @LazyCollection(LazyCollectionOption.FALSE)


    //@Fetch(value = FetchMode.SUBSELECT)
   // @Fetch(FetchMode.SELECT)
    //@Fetch(FetchMode.SELECT)
    @IndexColumn(name="list_index", nullable = false)
    @JoinColumn(name = "workplace_id")
    @OneToMany (cascade = CascadeType.ALL/*,mappedBy="workplace"*/,fetch = FetchType.EAGER)
    private List<UnitItem> units;

    public List<UnitItem> getUnits() {
        return units;
    }

    public void setUnits(List<UnitItem> units) {
        this.units = units;
    }
//    private Set<UnitItem> units;
//
//    public Set<UnitItem> getUnits() {
//        return units;
//    }
//
//    public void setUnits(Set<UnitItem> units) {
//            this.units = units;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

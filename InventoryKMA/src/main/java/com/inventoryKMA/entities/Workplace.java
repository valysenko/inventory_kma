package com.inventoryKMA.entities;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany //(fetch = FetchType.EAGER)
    @JoinColumn(name = "workplace_id")
    private List<UnitItem> units;

    public List<UnitItem> getUnits() {
        return units;
    }

    public void setUnits(List<UnitItem> units) {
        this.units = units;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

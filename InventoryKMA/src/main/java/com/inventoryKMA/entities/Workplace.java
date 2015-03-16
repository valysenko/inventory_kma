package com.inventoryKMA.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "workplace")
public class Workplace {
    @Id
    @GeneratedValue
    private Integer id;

    @OneToMany //(fetch = FetchType.EAGER)
    @JoinColumn(name = "workplace_id")
    private List<UnitManagement> units;

    public List<UnitManagement> getUnits() {
        return units;
    }

    public void setUnits(List<UnitManagement> units) {
        this.units = units;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

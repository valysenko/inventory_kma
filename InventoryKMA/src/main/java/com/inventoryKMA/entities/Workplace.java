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

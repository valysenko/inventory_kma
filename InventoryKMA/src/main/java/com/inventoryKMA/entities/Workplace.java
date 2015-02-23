package com.inventoryKMA.entities;

import java.util.ArrayList;

public class Workplace {
	private Integer id;
	private Classroom classroom;
	private ArrayList<Unit> units; 
	
	public ArrayList<Unit> getUnits() {
		return units;
	}
	public void setUnits(ArrayList<Unit> units) {
		this.units = units;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Classroom getClassroom() {
		return classroom;
	}
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	} 
}

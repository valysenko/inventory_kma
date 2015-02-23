package com.inventoryKMA.entities;

import java.util.ArrayList;

public class Classroom {
	private Integer id;
	private Integer rows;
	private Integer columns;
	private ArrayList<Workplace> workplaces;
	
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
	public ArrayList<Workplace> getWorkplaces() {
		return workplaces;
	}
	public void setWorkplaces(ArrayList<Workplace> workplaces) {
		this.workplaces = workplaces;
	}
}

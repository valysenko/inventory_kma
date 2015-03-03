package com.inventoryKMA.entities;

public class Unit {	
	private Integer id;
	private String name;
	private String number;
//	private Category category;	
//	private Classroom classroom;

	public Integer getId() {
		return id;
	}

	public Unit(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public Unit() {
		// TODO Auto-generated constructor stub
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

//	public Category getCategory() {
//		return category;
//	}
//
//	public void setCategory(Category category) {
//		this.category = category;
//	}
//
//
//	public Classroom getClassroom() {
//		return classroom;
//	}
//
//	public void setClassroom(Classroom classroom) {
//		this.classroom = classroom;
//	}
}

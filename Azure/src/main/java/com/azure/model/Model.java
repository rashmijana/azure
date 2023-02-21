package com.azure.model;



@javax.persistence.Entity
public class Model {
	
	@javax.persistence.Id
	private int roll;
	private int marks;
	
	
	
	public Model(int roll, int marks) {
		super();
		this.roll = roll;
		this.marks = marks;
	}
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Model [roll=" + roll + ", marks=" + marks + "]";
	}
	

}

package com.ashish.spring.entity;

public class Subject {
	
	String name;
	Teacher teacher;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
	@Override
	public String toString() {
		return "Subject [name=" + name + ", teacher=" + teacher + "]";
	}
	
	
	

}

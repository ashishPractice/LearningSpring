package com.ashish.spring.entity;

public class Student {
	
	String name;
	int age;
	String address;
	Subject subject;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	
	@Override
	public String toString() {
		return "Student [anme=" + name + ", age=" + age + ", address=" + address + ", subject=" + subject + "]";
	}
	
	
	
	

}

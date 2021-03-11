package com.ashish.spring.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.ashish.spring.entity.*;;

public class mainClass {
	
	public static void main(String[] args) {
		
		
//		Depricated way
//		Resource resources = new ClassPathResource("applicationContext.xml");
//		BeanFactory factory = new XmlBeanFactory(resources);
//		
//		
//		Teacher teacher = (Teacher) factory.getBean("teacher");
//		System.out.println(teacher);
//		
//		Subject subject = (Subject) factory.getBean("subject");
//		System.out.println(subject);
//		
//		Student student = (Student) factory.getBean("student");
//		System.out.println(student);
		
		
//		New way
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		Teacher teacher = (Teacher) context.getBean("teacher");
		System.out.println(teacher);
		
		Subject subject = (Subject) context.getBean("subject");
		System.out.println(subject);
		
		Student student = (Student) context.getBean("student");
		System.out.println(student);
				
	}

}

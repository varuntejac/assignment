package com.sonata;

import java.util.ArrayList;
import java.util.List;

public class Student
{
	   String name; 
	   int marks; 
	   int id;
	public Student(String name, int marks, int id) {
		this.name=name;
		this.marks=marks;
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", id=" + id + "]";
	} 

	public static void main(String[] args) {
	      List<Student> studentlist = new ArrayList<>();
	      studentlist.add(new Student("Varun", 99,1)); 
	      studentlist.add(new Student("Veera", 78,13)); 
	      studentlist.add(new Student("Bhavya", 89,3)); 
	      studentlist.add(new Student("Niharika",90,2)); 
	      studentlist.add(new Student("Gouse", 67,55));
	      studentlist.add(new Student("Nishu", 87,24));
	      System.out.println("After Sorting the Students Data by Marks:"); 

	      //Lambda expression for sorting by marks
	      studentlist.sort((Student s1, Student s2)->s2.getMarks()-s1.getMarks()); 

	      //  for printing the list of Students
	      studentlist.forEach((s)->System.out.println(s));         

	     
	      
	 }
	   
	}


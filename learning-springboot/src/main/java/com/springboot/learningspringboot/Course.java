package com.springboot.learningspringboot;

public class Course {

	private long id;
	private String name;
	private String author;
	
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	
	public long getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public String getAuthor() {
		return author;
	}



	public String toString() {
		return "Course ID: " + id + " Name: " + name + " Author: " + author;
	}
}

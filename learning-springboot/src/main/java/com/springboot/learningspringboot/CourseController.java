package com.springboot.learningspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourse(){
		return Arrays.asList(
				new Course(1, "Learn AWS", "ABCD"),
				new Course(2, "Learn Dev", "CDE"),
				new Course(3, "Learn Ops", "ABCD")
				
				);
	}
}
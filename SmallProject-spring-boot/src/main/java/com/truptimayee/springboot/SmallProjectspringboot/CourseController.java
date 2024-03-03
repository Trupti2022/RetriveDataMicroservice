package com.truptimayee.springboot.SmallProjectspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	//course
//	course: id, name,author
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourse(){
		return Arrays.asList(
				new Course(1, "Learn AWS", "Trupti"),
				new Course(2, "Learn DevOps", "Bishesh"),
				new Course(3, "Learn Cloud", "Jyoti")
				  
				);
	}

}

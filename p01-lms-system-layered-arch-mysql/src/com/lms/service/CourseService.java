package com.lms.service;

import com.lms.model.Course;
import com.lms.repository.CourseRepository;

public class CourseService {
	CourseRepository courseRepository = new CourseRepository();

	public void dollarsToEuros(Course course) {
		// conversion from dollar to euros
		course.setPrice(course.getPrice() / 2);
	}

	public void saveCourseToFileSystem(Course course) {
		// perform the business logic [transactions]
		System.out.println("perform buisness logic");
		dollarsToEuros(course);
		System.out.println("service sends the modified course to the repistory");
		courseRepository.saveCourseToFileSystem(course);
		// send the course to the repository
	}
}

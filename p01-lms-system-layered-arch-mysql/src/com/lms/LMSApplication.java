package com.lms;

import com.lms.model.Course;
import com.lms.service.CourseService;

public class LMSApplication {
	public static void main(String[] args) {
		System.out.println("Course Created");
		Course course = new Course();
		System.out.println("course passed on to service");
		CourseService courseService = new CourseService();
		courseService.saveCourseToFileSystem(course);
	}
}

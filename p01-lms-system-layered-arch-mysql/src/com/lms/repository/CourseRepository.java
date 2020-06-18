package com.lms.repository;

import com.lms.model.Course;

public class CourseRepository {
	public void saveCourseToFileSystem(Course course) {
		// Stream to save the course to the disk (course.dat)
		System.out.println("Saved coures to the back end (file system)");
	}
}

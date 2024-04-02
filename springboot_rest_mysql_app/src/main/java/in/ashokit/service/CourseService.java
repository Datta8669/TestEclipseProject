package in.ashokit.service;

import java.util.List;

import in.ashokit.binding.Course;

public interface CourseService {
	
	public String upsert(Course course); // this is single predefined method for ..save as well as update..

	public Course getById(Integer cid);

	public List<Course> getAllCourses();

	public String deleteById(Integer cid);
}

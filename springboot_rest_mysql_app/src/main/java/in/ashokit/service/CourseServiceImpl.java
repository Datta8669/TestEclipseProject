package in.ashokit.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Course;
import in.ashokit.repo.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepo;

	@Override
	public String upsert(Course course) {
		courseRepo.save(course);
		return "success...........";
	}

	@Override
	public Course getById(Integer cid) {

		Optional<Course> findById = courseRepo.findById(cid);
		if (findById.isPresent()) {

			return findById.get();
		}
		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		return courseRepo.findAll();

	}

	@Override
	public String deleteById(Integer cid) {
		if (courseRepo.existsById(cid)) {
			courseRepo.deleteById(cid);
			return "delete success";
		}else {
		return "No record found";
	}
		}

}
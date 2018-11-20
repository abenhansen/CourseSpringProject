package studentcourses.demo.model;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,Long> {
    Course findById(long id);
    Course deleteById(long id);
}

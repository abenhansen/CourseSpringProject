package studentcourses.demo.model;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
    Student findById(long id);
    Student deleteById(long id);
}

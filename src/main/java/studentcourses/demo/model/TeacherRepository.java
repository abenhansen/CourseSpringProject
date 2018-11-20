package studentcourses.demo.model;

import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher, Long> {
        Teacher findById(long id);
        Teacher deleteById(long id);

    }

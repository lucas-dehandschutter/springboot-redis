package org.lucas.springbootredis.repository;

import org.lucas.springbootredis.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String> {

}

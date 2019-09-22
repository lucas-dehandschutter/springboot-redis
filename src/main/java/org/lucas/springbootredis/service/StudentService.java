package org.lucas.springbootredis.service;

import org.lucas.springbootredis.repository.StudentRepository;
import org.lucas.springbootredis.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository repository;

    public Student saveStudent(Student student){
        return repository.save(student);
    }

    public Student retrieveStudentById(String id){
        return repository.findById(id).orElse(null);
    }

    public void deleteStudentById(String id) {
        repository.deleteById(id);
    }

    public Iterable<Student> findAllStudents(){
        return repository.findAll();
    }
}

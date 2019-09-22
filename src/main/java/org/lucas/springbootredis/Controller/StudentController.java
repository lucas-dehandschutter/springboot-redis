package org.lucas.springbootredis.Controller;


import org.lucas.springbootredis.entity.Student;
import org.lucas.springbootredis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("{id}")
    public @ResponseBody
    ResponseEntity<Student> getById(@PathVariable String id) {
        return new ResponseEntity<Student>(service.retrieveStudentById(id), HttpStatus.OK);
    }

    @PostMapping
    public @ResponseBody ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return new ResponseEntity<>(service.saveStudent(student),HttpStatus.OK);
    }

    @DeleteMapping
    public @ResponseBody ResponseEntity<Void> deleteStudent(@RequestBody String id) {
        service.deleteStudentById(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @GetMapping
    public @ResponseBody ResponseEntity<List<Student>> findAllStudents(){
        return new ResponseEntity<List<Student>>((List<Student>) service.findAllStudents(),HttpStatus.OK);
    }

}

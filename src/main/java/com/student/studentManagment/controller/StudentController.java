package com.student.studentManagment.controller;

import com.student.studentManagment.model.Student;
import com.student.studentManagment.repository.StudentRepository;
import com.student.studentManagment.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service){
        this.service=service;
    }

    //create
    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return service.save(student);
    }

    //read all
    @GetMapping
    public List<Student> getStudents(){
        return service.getAll();
    }

    //read by id
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id){
        return service.getById(id);
    }

    //delete by id
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id){
        service.delet(id);
        return "Deleted succesfully";
    }
}

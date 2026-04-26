package com.student.studentManagment.service;
import com.student.studentManagment.model.Student;
import com.student.studentManagment.repository.StudentRepository;
import org.springframework.stereotype.Service;

import  java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private final StudentRepository repo;

    public StudentServiceImpl(StudentRepository repo){
        this.repo=repo;
    }

    @Override
    public Student save(Student student) {
        return repo.save(student);
    }

    @Override
    public List<Student> getAll() {
        return repo.findAll();
    }

    @Override
    public Student getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void delet(Long id) {
      repo.deleteById(id);
    }
}

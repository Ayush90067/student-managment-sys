package com.student.studentManagment.service;
import com.student.studentManagment.model.Student;
import java.util.List;

public interface StudentService {

    Student save(Student student);
    List<Student> getAll();
    Student getById(Long id);
    void delete(Long id);

}

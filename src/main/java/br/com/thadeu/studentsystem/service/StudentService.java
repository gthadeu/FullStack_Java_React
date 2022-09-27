package br.com.thadeu.studentsystem.service;

import br.com.thadeu.studentsystem.model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudent();

}

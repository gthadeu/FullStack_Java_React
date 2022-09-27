package br.com.thadeu.studentsystem.repository;

import br.com.thadeu.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}

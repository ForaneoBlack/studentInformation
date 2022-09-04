package com.foraneo.studentInformation.repository;

import com.foraneo.studentInformation.modelo.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentRepository extends MongoRepository<Student, String> {

    Student findBynStudent(long nStudent);
    Student findByEmail (String email);
    List<Student> findByOrderByGpa();

}

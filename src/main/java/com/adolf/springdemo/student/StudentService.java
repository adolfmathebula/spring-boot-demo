package com.adolf.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Adolf",
                        "Mathebula",
                        LocalDate.now(),
                        "contact@adolf.co.za",
                        32
                ),
                new Student(
                        "Joe",
                        "Smith",
                        LocalDate.now(),
                        "contact@joe.com",
                        28
                )

        );
    }
}

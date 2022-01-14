package com.example.interview.repository;

import com.example.interview.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public class StudentRepository implements JpaRepository<Student, Integer> {
}

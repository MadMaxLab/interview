package com.example.interview.repository;

import com.example.interview.entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ExamRepository  implements JpaRepository<Exam, Integer> {
}

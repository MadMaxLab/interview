package com.example.interview.repository;

import com.example.interview.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public class ProfessorRepository implements JpaRepository<Professor, Integer> {
}

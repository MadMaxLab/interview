package com.example.interview.service;

import com.example.interview.entity.Exam;
import com.example.interview.entity.Professor;
import com.example.interview.entity.Student;

import java.util.List;

public interface ExamService {
    Exam create(List<Student> students, Professor professor);
}

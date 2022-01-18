package com.example.interview.service;

import com.example.interview.entity.Exam;
import com.example.interview.entity.Professor;
import com.example.interview.entity.Student;
import com.example.interview.repository.ExamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ExamServiceImpl implements ExamService {
    private final ExamRepository examRepository;

    @Value("${my.exam.prefix}")
    private String examNamePrefix;

    @Override
    public Exam create(List<Student> students, Professor professor) {
        Exam exam = new Exam();
        exam.setStudents(students);
        exam.setProfessor(professor);
        return examRepository.saveAndFlush(exam);
    }

    @Override
    public Exam createEmpty() {
        Exam exam = new Exam();
        exam.setTitle(examNamePrefix + UUID.randomUUID());
        exam.setStudents(null);
        exam.setProfessor(null);
        return examRepository.saveAndFlush(exam);
    }
}

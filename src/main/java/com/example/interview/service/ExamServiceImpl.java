package com.example.interview.service;

import com.example.interview.entity.Exam;
import com.example.interview.entity.Professor;
import com.example.interview.entity.Student;
import com.example.interview.repository.ExamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExamServiceImpl implements ExamService {
    private final ExamRepository examRepository;

    @Override
    public Exam create(List<Student> students, Professor professor) {
        Exam exam = new Exam();
        exam.setStudents(students);
        exam.setProfessor(professor);
        return examRepository.saveAndFlush(exam);
    }
}

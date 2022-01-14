package com.example.interview.service;

import com.example.interview.entity.Professor;
import com.example.interview.entity.Student;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

@Service
@ConditionalOnMissingBean(UploadService.class)
public class UploadServiceImpl implements UploadService {
    private final ExamService examService;
    private final StudentService studentService;
    private final ProfessorService professorService;

    @Override
    public boolean processBatch() {
        List<Student> students = Stream.iterate(0, i -> i++).limit(5)
                .map(i -> studentService.create(Student.builder().name("Student-" + i).build()))
                .toList();

        Professor professor = professorService.create(Professor.builder().name(UUID.randomUUID().toString()).build());

        examService.create(students, professor);
        return true;
    }
}

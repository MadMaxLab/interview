package com.example.interview.service;

import com.example.interview.entity.Student;
import com.example.interview.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public Student create(Student student) {
        return studentRepository.saveAndFlush(student);
    }
}

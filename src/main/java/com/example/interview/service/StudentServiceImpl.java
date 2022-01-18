package com.example.interview.service;

import com.example.interview.entity.Student;
import com.example.interview.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public void setStudentRepository(@Autowired StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student create(Student student) {
        return studentRepository.saveAndFlush(student);
    }
}

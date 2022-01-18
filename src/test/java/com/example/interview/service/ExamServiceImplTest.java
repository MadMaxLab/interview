package com.example.interview.service;

import com.example.interview.entity.Exam;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ExamServiceImplTest {
    @Autowired
    private ExamService examService;

    @Test
    void createShouldSetPrefix() {
        Exam actualExam = examService.createEmpty();
        assertNotEquals(actualExam.getTitle().length(), UUID.randomUUID().toString().length());
    }

}
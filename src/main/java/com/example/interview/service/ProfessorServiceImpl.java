package com.example.interview.service;

import com.example.interview.entity.Professor;
import com.example.interview.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorServiceImpl implements ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public Professor create(Professor professor) {
        return professorRepository.saveAndFlush(professor);
    }
}

package com.example.interview.service;

import com.example.interview.entity.Professor;
import com.example.interview.repository.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfessorServiceImpl implements ProfessorService {
    private final ProfessorRepository professorRepository;

    @Override
    public Professor create(Professor professor) {
        return professorRepository.saveAndFlush(professor);
    }
}

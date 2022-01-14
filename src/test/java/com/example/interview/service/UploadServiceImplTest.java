package com.example.interview.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertTrue;

class UploadServiceImplTest {
    @Autowired
    private UploadService uploadService;

    @Test
    void processBatchShouldWork() {
        assertTrue(uploadService.processBatch());
    }

}
package com.example.interview.service;

import org.springframework.stereotype.Service;

@Service
public class UploadServiceSecondImpl implements UploadService{
    @Override
    public boolean processBatch() {
        return false;
    }
}

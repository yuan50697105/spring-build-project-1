package org.example.spring.impl;

import org.example.spring.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public void test() {
        System.out.println("TestServiceImpl.test");
    }
}
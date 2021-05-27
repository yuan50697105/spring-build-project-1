package org.example.spring.impl;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImplImpl extends TestServiceImpl {
    @Override
    public void test() {
        System.out.println("TestServiceImplImpl.test");
    }
}
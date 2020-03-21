package com.example.demo.service.impl;

import com.example.demo.service.TestTservice;
import org.springframework.stereotype.Service;


/**
 * @author 车天亮
 */
@Service
public class TestTServiceImpl implements TestTservice<String> {

    @Override
    public void add(String s) {
        System.out.println("hello world\n" + s);
    }
}

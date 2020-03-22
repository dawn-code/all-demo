package com.example.demo.fanxing.impl;

import com.example.demo.fanxing.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author 车天亮
 */
@Service
public class DemoStringServiceImpl implements DemoService<String> {

    @Override
    public void print(String str) {
        System.out.println("hello kity\n" + str);
    }
}

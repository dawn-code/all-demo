package com.example.demo.fanxing.impl;

import com.example.demo.fanxing.DemoService;
import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @author 车天亮
 * {@link DemoService}
 */
@Data
@Service
public class DemoIntegerServiceImpl implements DemoService<Integer> {

    @Override
    public void print(Integer t) {
        System.out.println(t + 2);
    }
}

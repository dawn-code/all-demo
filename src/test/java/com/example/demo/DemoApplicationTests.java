package com.example.demo;

import com.example.demo.fanxing.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {

    @Autowired
    @Qualifier("demoStringServiceImpl")
    DemoService<String> service;

    @Test
    public void contextLoads() {
        service.print("chetianliang");
    }

}

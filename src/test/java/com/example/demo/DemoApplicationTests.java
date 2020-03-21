package com.example.demo;

import com.example.demo.service.TestTservice;
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
    @Qualifier("testT2ServiceImpl")
    TestTservice testTservice;

    @Test
    public void contextLoads() {
        testTservice.add("车天亮");
    }

}

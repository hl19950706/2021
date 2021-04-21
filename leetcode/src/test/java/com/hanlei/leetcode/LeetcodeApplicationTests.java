package com.hanlei.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LeetcodeApplicationTests {

    @Value("${test.value}")
    private String value;

    @Test
    void contextLoads() {
        System.out.println(value);
        String[] split = value.split("\\|");
        for (String s : split) {
            System.out.println(s);
        }
    }

}

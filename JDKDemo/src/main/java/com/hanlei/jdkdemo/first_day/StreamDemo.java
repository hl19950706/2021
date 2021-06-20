package com.hanlei.jdkdemo.first_day;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * jdk8 streamdemo
 *
 * @author hanlei
 */
public class StreamDemo {

    public final List<String> strings = new ArrayList<>(
            Arrays.asList("zhangsan", "liuneng", "lisi", "wangwu", "zhaoliu", "zhuhe", "aliang", "pingan", "test")
    );

    /**
     * 比较常用的循环的性能
     */
    @Test
    public void test1() {

        AtomicReference<String> s = new AtomicReference<>("");

        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            for (int i1 = 0; i1 < strings.size(); i1++) {
                s.set(strings.get(i1));
            }
        }
        System.out.println("fori -> " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            for (String string : strings) {
                s.set(string);
            }
        }
        System.out.println("for -> " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            strings.forEach(x -> {
                s.set(x);
            });
        }
        System.out.println("forEach -> " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            strings.stream().forEach(x -> {
                s.set(x);
            });
        }
        System.out.println("stream -> " + (System.currentTimeMillis() - startTime));
    }
}

package com.hanlei.jdkdemo.first_day;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author hanlei
 */
public class LambdaDebugTest {

    List<String> stringList = Arrays.asList(new String[]{"aaaa", "bbb", "cccccc", "dd", "eeeeeeeeee"});

    @Test
    public void test1() {
        List<String> collect = stringList.stream()
                .filter(x -> x.length() > 5)
                .map(x -> x + x)
                .collect(Collectors.toList());
    }
}

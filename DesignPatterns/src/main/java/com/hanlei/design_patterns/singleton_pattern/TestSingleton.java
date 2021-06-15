package com.hanlei.design_patterns.singleton_pattern;

/**
 * @author hanlei
 */
public class TestSingleton {

    public static void main(String[] args) {
        EnumSingleton.Singleton instance = EnumSingleton.INSTANCE.getInstance();
    }
}

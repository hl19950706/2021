package com.hanlei.design_patterns.singleton_pattern;

/**
 * @author hanlei
 * 饿汉式单例模式
 */
public class HungrySingleton {
    private final static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){};

    public static HungrySingleton getInstance(){
        return instance;
    }
}

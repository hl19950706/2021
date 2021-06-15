package com.hanlei.design_patterns.singleton_pattern;

/**
 * @author hanlei
 * 懒汉式安全的但不高效的单例
 */
public class LazySafeUnEfficientSingleton {
    private static LazySafeUnEfficientSingleton instance = null;

    private LazySafeUnEfficientSingleton(){};

    public synchronized static LazySafeUnEfficientSingleton getInstance(){
        if (instance == null) {
            instance = new LazySafeUnEfficientSingleton();
        }
        return instance;
    }
}

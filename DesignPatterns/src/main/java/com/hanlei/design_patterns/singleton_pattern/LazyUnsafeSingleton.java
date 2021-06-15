package com.hanlei.design_patterns.singleton_pattern;

/**
 * @author hanlei
 * 不安全的懒汉式单例
 */
public class LazyUnsafeSingleton {

    private static LazyUnsafeSingleton instance = null;

    private LazyUnsafeSingleton(){};

    public static LazyUnsafeSingleton getInstance(){
        if(instance == null){
            instance = new LazyUnsafeSingleton();
        }
        return instance;
    }
}

package com.hanlei.design_patterns.singleton_pattern;

/**
 * @author hanlei
 * 懒汉式高效安全的单例
 */
public class LazyBetterSingleton {
    private static volatile LazyBetterSingleton instance = null;

    private LazyBetterSingleton(){};

    public static LazyBetterSingleton getInstance(){
        if (instance == null){
            synchronized (LazyBetterSingleton.class){
                if(instance == null){
                    instance = new LazyBetterSingleton();
                }
            }
        }
        return instance;
    }
}

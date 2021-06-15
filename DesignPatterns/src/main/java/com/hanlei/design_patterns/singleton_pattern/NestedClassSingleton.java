package com.hanlei.design_patterns.singleton_pattern;

/**
 * @author hanlei
 * 内部类单例
 */
public class NestedClassSingleton {
    private NestedClassSingleton(){}

    private static class NestedClassSingletonHolder{
        private static final NestedClassSingleton instance = new NestedClassSingleton();
    }

    public static final NestedClassSingleton getInstance(){
        return NestedClassSingletonHolder.instance;
    }
}

package com.hanlei.design_patterns.singleton_pattern;

/**
 * @author hanlei
 * 枚举单例
 */
public enum EnumSingleton {
    INSTANCE;

    private Singleton instance = null;
    EnumSingleton(){
        instance = new Singleton();
    }

    public Singleton getInstance(){
        return instance;
    }

    /**
     * <h1>业务逻辑</h1>
     */
    public class Singleton{
        private Singleton(){}
    }
}

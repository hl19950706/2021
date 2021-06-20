package com.hanlei.design_patterns.factory_pattern.simple;

/**
 * @author hanlei
 */
public interface SimpleFactory {

    /**
     * 工厂创建对象
     * @param productClass 需要创建的对象类
     * @return  创建成功的对象
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    <T extends Product> T createProduct(Class<T> productClass);
}

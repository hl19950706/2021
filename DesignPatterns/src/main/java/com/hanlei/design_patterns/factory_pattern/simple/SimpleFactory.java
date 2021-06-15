package com.hanlei.design_patterns.factory_pattern.simple;

import com.hanlei.design_patterns.factory_pattern.Product;

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
    Product createProduct(Class<Product> productClass) throws InstantiationException, IllegalAccessException;
}

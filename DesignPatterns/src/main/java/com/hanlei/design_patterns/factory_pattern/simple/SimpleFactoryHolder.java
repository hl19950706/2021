package com.hanlei.design_patterns.factory_pattern.simple;

import com.hanlei.design_patterns.factory_pattern.Product;

/**
 * @author hanlei
 */
public class SimpleFactoryHolder implements SimpleFactory{
    @Override
    public Product createProduct(Class<Product> productClass) throws InstantiationException, IllegalAccessException {
        return productClass.newInstance();
    }
}

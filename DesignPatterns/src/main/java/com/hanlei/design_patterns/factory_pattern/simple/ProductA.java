package com.hanlei.design_patterns.factory_pattern.simple;

/**
 * @author hanlei
 */
public class ProductA extends Product {

    @Override
    public String getName() {
        return "ProductA";
    }

    @Override
    public String getSize() {
        return "ProductA:1";
    }
}

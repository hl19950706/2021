package com.hanlei.design_patterns.factory_pattern.simple;

/**
 * @author hanlei
 */
public class ProductB extends Product {


    @Override
    public String getName() {
        return "ProductB";
    }

    @Override
    public String getSize() {
        return "ProductB:4";
    }
}

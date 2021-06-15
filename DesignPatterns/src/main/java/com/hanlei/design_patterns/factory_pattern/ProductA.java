package com.hanlei.design_patterns.factory_pattern;

/**
 * @author hanlei
 */
public class ProductA implements Product{

    @Override
    public String getName() {
        return "ProductA";
    }

    @Override
    public String getSize() {
        return "ProductA:1";
    }
}

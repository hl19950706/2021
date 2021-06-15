package com.hanlei.design_patterns.factory_pattern;

/**
 * @author hanlei
 */
public class ProductB implements Product{


    @Override
    public String getName() {
        return "ProductB";
    }

    @Override
    public String getSize() {
        return "ProductB:4";
    }
}

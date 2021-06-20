package com.hanlei.design_patterns.factory_pattern.simple;

/**
 * @author hanlei
 */
public abstract class Product {

    public abstract String getName();

    public abstract String getSize();

    public void msg(){
        System.out.println("Product....");
    }
}

package com.hanlei.design_patterns.factory_pattern.simple;

/**
 * @author hanlei
 * 工厂模式
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimpleFactory sf = new SimpleFactoryHolder();
        Product productA = sf.createProduct(ProductA.class);
        Product productB = sf.createProduct(ProductB.class);
        System.out.println(productA.getName());
        System.out.println(productA.getSize());

        System.out.println(productB.getName());
        System.out.println(productB.getSize());

        productA.msg();
        productB.msg();
    }
}

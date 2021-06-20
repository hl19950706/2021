package com.hanlei.design_patterns.factory_pattern.abstract_factory;

/**
 * @author hanlei
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractCreater creator1 = new Creator1();
        AbstractCreater creator2 = new Creator2();

        AbstractProductA a1 = creator1.createProductA();
        AbstractProductB b1 = creator1.createProductB();

        AbstractProductA a2 = creator2.createProductA();
        AbstractProductB b2 = creator2.createProductB();

        a1.doSomething();
        b1.doSomething();
        a2.doSomething();
        b2.doSomething();
    }
}

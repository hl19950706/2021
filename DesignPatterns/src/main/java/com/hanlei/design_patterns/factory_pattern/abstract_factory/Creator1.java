package com.hanlei.design_patterns.factory_pattern.abstract_factory;

/**
 * @author hanlei
 */
public class Creator1 extends AbstractCreater{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}

package com.hanlei.design_patterns.factory_pattern.abstract_factory;

/**
 * @author hanlei
 */
public class Creator2 extends AbstractCreater{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}

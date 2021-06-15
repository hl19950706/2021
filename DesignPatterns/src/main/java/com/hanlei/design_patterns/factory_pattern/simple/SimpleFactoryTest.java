package com.hanlei.design_patterns.factory_pattern.simple;

import com.hanlei.design_patterns.factory_pattern.Product;
import com.hanlei.design_patterns.factory_pattern.ProductA;

/**
 * @author hanlei
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimpleFactory sf = new SimpleFactoryHolder();
    }
}

package com.hanlei.design_patterns.factory_pattern.simple;

/**
 * @author hanlei
 */
public class SimpleFactoryHolder implements SimpleFactory{
    
    @Override
    public <T extends Product> T createProduct(Class<T> productClass){
        Product product = null;
        try {
            product = (Product) Class.forName(productClass.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}

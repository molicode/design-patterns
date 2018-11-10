package com.design.patterns.creational.patterns.abstractfactory.pattern;

/**
 * Created by luifermt on 9/11/2018.
 */
public class ConcreteFactoryOne extends AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductAOne();
    }

    @Override
    public AbstractProductB createProductB() {
        return null;
    }
}

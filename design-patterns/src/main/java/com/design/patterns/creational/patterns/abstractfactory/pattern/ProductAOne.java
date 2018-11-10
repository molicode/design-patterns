package com.design.patterns.creational.patterns.abstractfactory.pattern;

/**
 * Created by luifermt on 9/11/2018.
 */
public class ProductAOne extends AbstractProductA {

    public ProductAOne(String name, String description) {
        super(name, description);
    }

    public ProductAOne() {
        setName("Product A - Part One");
        setDescription("Description of Product A - Part One");
    }

}

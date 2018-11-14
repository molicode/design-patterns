package com.design.patterns.creational.abstractfactory.pattern;

/**
 * Created by luifermt on 9/11/2018.
 */
public class ProductBOne extends AbstractProductB {

    public ProductBOne(String name, String description) {
        super(name, description);
    }

    public ProductBOne() {
        setName("Product B - Part One");
        setDescription("Description of Product B - Part One");
    }

}

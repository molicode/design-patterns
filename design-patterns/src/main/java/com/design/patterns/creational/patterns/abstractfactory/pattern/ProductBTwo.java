package com.design.patterns.creational.patterns.abstractfactory.pattern;

/**
 * Created by luifermt on 9/11/2018.
 */
public class ProductBTwo extends AbstractProductB {

    public ProductBTwo(String name, String description) {
        super(name, description);
    }

    public ProductBTwo() {
        setName("Product B - Part Two");
        setDescription("Description of Product B - Part Two");
    }

}

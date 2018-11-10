package com.design.patterns.creational.patterns.abstractfactory.pattern;

/**
 * Created by luifermt on 9/11/2018.
 */
public class ProductATwo extends AbstractProductA {

    public ProductATwo(String name, String description) {
        super(name, description);
    }

    public ProductATwo() {
        setName("Product A - Part Two");
        setDescription("Description of Product A - Part Two");
    }
}

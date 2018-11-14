package com.design.patterns.creational.abstractfactory.pattern;

/**
 * Created by luifermt on 9/11/2018.
 */
public abstract class AbstractProductA {

    private String name;
    private String description;

    //------------------------------------------------------------------------------ Constructors
    public AbstractProductA() {
    }

    public AbstractProductA(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //------------------------------------------------------------------------------ Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //------------------------------------------------------------------------------ toString
    @Override
    public String toString() {
        return "AbstractProductA{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    //------------------------------------------------------------------------------ own methods
    public String getInformation() {
        return "Product: " + getName() + " | Description: " + getDescription();
    }
}

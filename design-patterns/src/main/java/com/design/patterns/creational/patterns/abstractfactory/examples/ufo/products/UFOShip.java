package com.design.patterns.creational.patterns.abstractfactory.examples.ufo.products;

import com.design.patterns.creational.patterns.abstractfactory.examples.ufo.factories.ShipFactory;
import com.design.patterns.creational.patterns.abstractfactory.examples.ufo.factories.UFOShipFactory;

public class UFOShip extends Ship {

    private ShipFactory shipFactory;

    public UFOShip() {
        setName("UFO Ship");
        this.shipFactory = new UFOShipFactory();
    }

    @Override
    public void makeShip() {
        System.out.println("Making new " + getName());
        setShipEngine(shipFactory.makeShipEngine());
        setShipWeapon(shipFactory.makeShipGun());
    }

}

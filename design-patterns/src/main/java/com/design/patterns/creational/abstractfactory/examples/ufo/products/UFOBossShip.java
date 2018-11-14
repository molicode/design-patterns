package com.design.patterns.creational.abstractfactory.examples.ufo.products;

import com.design.patterns.creational.abstractfactory.examples.ufo.factories.ShipFactory;
import com.design.patterns.creational.abstractfactory.examples.ufo.factories.UFOBossShipFactory;

public class UFOBossShip extends Ship {

    private ShipFactory shipFactory;

    public UFOBossShip() {
        setName("UFO Boss Ship");
        this.shipFactory = new UFOBossShipFactory();
    }

    public ShipFactory getShipFactory() {
        return shipFactory;
    }

    public void setShipFactory(ShipFactory shipFactory) {
        this.shipFactory = shipFactory;
    }

    @Override
    public void makeShip() {
        System.out.println("Making new " + getName());
        setShipEngine(shipFactory.makeShipEngine());
        setShipWeapon(shipFactory.makeShipGun());
    }

}
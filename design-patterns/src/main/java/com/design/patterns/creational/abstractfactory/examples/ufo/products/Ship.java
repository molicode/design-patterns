package com.design.patterns.creational.abstractfactory.examples.ufo.products;

import com.design.patterns.creational.abstractfactory.examples.ufo.parts.ship.engine.ShipEngine;
import com.design.patterns.creational.abstractfactory.examples.ufo.parts.ship.weapon.ShipWeapon;

public abstract class Ship {

    private String name;
    private ShipWeapon shipWeapon;
    private ShipEngine shipEngine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShipWeapon getShipWeapon() {
        return shipWeapon;
    }

    public void setShipWeapon(ShipWeapon shipWeapon) {
        this.shipWeapon = shipWeapon;
    }

    public ShipEngine getShipEngine() {
        return shipEngine;
    }

    public void setShipEngine(ShipEngine shipEngine) {
        this.shipEngine = shipEngine;
    }

    @Override
    public String toString() {
        return "NAME: " + getName() +
                " | ENGINE: "+ shipEngine.getShipEngineInformation() +
                " | WEAPON: " + shipWeapon.getShipWeaponInformation();
    }

    public abstract void makeShip();

}

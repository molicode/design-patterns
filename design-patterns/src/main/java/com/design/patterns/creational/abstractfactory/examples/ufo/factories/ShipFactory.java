package com.design.patterns.creational.abstractfactory.examples.ufo.factories;

import com.design.patterns.creational.abstractfactory.examples.ufo.parts.ship.engine.ShipEngine;
import com.design.patterns.creational.abstractfactory.examples.ufo.parts.ship.weapon.ShipWeapon;

public abstract class ShipFactory {

    public abstract ShipWeapon makeShipGun();
    public abstract ShipEngine makeShipEngine();

}

package com.design.patterns.creational.abstractfactory.examples.ufo.factories;

import com.design.patterns.creational.abstractfactory.examples.ufo.parts.ship.engine.ShipEngine;
import com.design.patterns.creational.abstractfactory.examples.ufo.parts.ship.engine.UFOEngine;
import com.design.patterns.creational.abstractfactory.examples.ufo.parts.ship.weapon.ShipWeapon;
import com.design.patterns.creational.abstractfactory.examples.ufo.parts.ship.weapon.UFOGun;

public class UFOShipFactory extends ShipFactory {

    @Override
    public ShipWeapon makeShipGun() {
        return new UFOGun();
    }

    @Override
    public ShipEngine makeShipEngine() {
        return new UFOEngine();
    }
}

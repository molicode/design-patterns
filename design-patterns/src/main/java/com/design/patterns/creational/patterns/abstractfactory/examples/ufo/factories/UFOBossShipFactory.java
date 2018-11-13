package com.design.patterns.creational.patterns.abstractfactory.examples.ufo.factories;

import com.design.patterns.creational.patterns.abstractfactory.examples.ufo.parts.ship.engine.ShipEngine;
import com.design.patterns.creational.patterns.abstractfactory.examples.ufo.parts.ship.engine.UFOBossEngine;
import com.design.patterns.creational.patterns.abstractfactory.examples.ufo.parts.ship.weapon.ShipWeapon;
import com.design.patterns.creational.patterns.abstractfactory.examples.ufo.parts.ship.weapon.UFOBossGun;

public class UFOBossShipFactory extends ShipFactory
{
    @Override
    public ShipWeapon makeShipGun() {
        return new UFOBossGun();
    }

    @Override
    public ShipEngine makeShipEngine() {
        return new UFOBossEngine();
    }
}

package com.design.patterns.creational.patterns.abstractfactory.examples.ufo.parts.ship.weapon;

public class UFOGun implements ShipWeapon {
    @Override
    public String getShipWeaponInformation() {
        return "20 damage";
    }
}

package com.design.patterns.creational.abstractfactory.examples.ufo.parts.ship.weapon;

public class UFOGun implements ShipWeapon {
    @Override
    public String getShipWeaponInformation() {
        return "20 damage";
    }
}

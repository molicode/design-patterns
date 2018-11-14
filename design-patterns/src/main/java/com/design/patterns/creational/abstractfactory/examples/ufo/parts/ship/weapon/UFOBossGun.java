package com.design.patterns.creational.abstractfactory.examples.ufo.parts.ship.weapon;

public class UFOBossGun implements ShipWeapon {
    @Override
    public String getShipWeaponInformation() {
        return "50 damage";
    }
}

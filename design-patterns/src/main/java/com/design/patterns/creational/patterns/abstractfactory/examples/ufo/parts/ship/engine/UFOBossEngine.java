package com.design.patterns.creational.patterns.abstractfactory.examples.ufo.parts.ship.engine;

public class UFOBossEngine implements ShipEngine {
    @Override
    public String getShipEngineInformation() {
        return "5000 mph";
    }
}

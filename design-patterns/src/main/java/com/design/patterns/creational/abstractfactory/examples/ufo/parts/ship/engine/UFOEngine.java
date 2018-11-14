package com.design.patterns.creational.abstractfactory.examples.ufo.parts.ship.engine;

public class UFOEngine implements ShipEngine {
    @Override
    public String getShipEngineInformation() {
        return "1000 mph";
    }
}

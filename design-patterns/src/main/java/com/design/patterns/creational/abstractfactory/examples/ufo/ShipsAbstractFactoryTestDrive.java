package com.design.patterns.creational.abstractfactory.examples.ufo;

import com.design.patterns.creational.abstractfactory.examples.ufo.products.Ship;
import com.design.patterns.creational.abstractfactory.examples.ufo.products.UFOBossShip;
import com.design.patterns.creational.abstractfactory.examples.ufo.products.UFOShip;

public class ShipsAbstractFactoryTestDrive {

    public static void main(String[] args) {

        Ship ship;
        String typeShip;

        typeShip = "ufo";
        if (typeShip.equalsIgnoreCase("ufo")) {
            ship = new UFOShip();
            ship.makeShip();
            System.out.println(ship.toString());
        }

        typeShip = "boss";
        if (typeShip.equalsIgnoreCase("boss")) {
            ship = new UFOBossShip();
            ship.makeShip();
            System.out.println(ship.toString());
        }

    }
}

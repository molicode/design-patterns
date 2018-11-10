package com.design.patterns.creational.patterns.abstractfactory.examples.kingdom;

import com.design.patterns.creational.patterns.abstractfactory.examples.kingdom.factories.ElfKingdomFactory;
import com.design.patterns.creational.patterns.abstractfactory.examples.kingdom.factories.KingdomFactory;
import com.design.patterns.creational.patterns.abstractfactory.examples.kingdom.factories.MenKingdomFactory;
import com.design.patterns.creational.patterns.abstractfactory.examples.kingdom.parts.Army;
import com.design.patterns.creational.patterns.abstractfactory.examples.kingdom.parts.Castle;
import com.design.patterns.creational.patterns.abstractfactory.examples.kingdom.parts.King;

public class KingdomTestDrive {

    public static void main(String[] args) {
        createKingdom(new ElfKingdomFactory());
        createKingdom(new MenKingdomFactory());

    }

    public static void createKingdom(KingdomFactory factory) {
        King king = factory.makeKing();
        Castle castle = factory.makeCastle();
        Army army = factory.makeArmy();
        System.out.println("The kingdom was created: ");
        System.out.println(king);
        System.out.println(castle);
        System.out.println(army);
    }

}

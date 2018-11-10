package com.design.patterns.creational.patterns.abstractfactory.examples.kingdom.factories;

import com.design.patterns.creational.patterns.abstractfactory.examples.kingdom.parts.Army;
import com.design.patterns.creational.patterns.abstractfactory.examples.kingdom.parts.Castle;
import com.design.patterns.creational.patterns.abstractfactory.examples.kingdom.parts.King;
import com.design.patterns.creational.patterns.abstractfactory.examples.kingdom.parts.implement.men.MenArmy;
import com.design.patterns.creational.patterns.abstractfactory.examples.kingdom.parts.implement.men.MenCastle;
import com.design.patterns.creational.patterns.abstractfactory.examples.kingdom.parts.implement.men.MenKing;

/**
 * Created by luifermt on 9/11/2018.
 */
public class MenKingdomFactory extends KingdomFactory {

    @Override
    public Castle makeCastle() {
        return new MenCastle();
    }

    @Override
    public King makeKing() {
        return new MenKing();
    }

    @Override
    public Army makeArmy() {
        return new MenArmy();
    }

}

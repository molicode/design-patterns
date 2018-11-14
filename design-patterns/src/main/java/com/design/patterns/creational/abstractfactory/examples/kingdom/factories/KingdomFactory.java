package com.design.patterns.creational.abstractfactory.examples.kingdom.factories;


import com.design.patterns.creational.abstractfactory.examples.kingdom.parts.Army;
import com.design.patterns.creational.abstractfactory.examples.kingdom.parts.Castle;
import com.design.patterns.creational.abstractfactory.examples.kingdom.parts.King;

/**
 * Created by luifermt on 9/11/2018.
 */
public abstract class KingdomFactory {

    public abstract Castle makeCastle();
    public abstract King makeKing();
    public abstract Army makeArmy();

}

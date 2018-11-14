package com.design.patterns.creational.abstractfactory.examples.kingdom.factories;

import com.design.patterns.creational.abstractfactory.examples.kingdom.parts.Army;
import com.design.patterns.creational.abstractfactory.examples.kingdom.parts.Castle;
import com.design.patterns.creational.abstractfactory.examples.kingdom.parts.King;
import com.design.patterns.creational.abstractfactory.examples.kingdom.parts.implement.elf.ElfArmy;
import com.design.patterns.creational.abstractfactory.examples.kingdom.parts.implement.elf.ElfCastle;
import com.design.patterns.creational.abstractfactory.examples.kingdom.parts.implement.elf.ElfKing;

/**
 * Created by luifermt on 9/11/2018.
 */
public class ElfKingdomFactory extends KingdomFactory {
    @Override
    public Castle makeCastle() {
        return new ElfCastle();
    }

    @Override
    public King makeKing() {
        return new ElfKing();
    }

    @Override
    public Army makeArmy() {
        return new ElfArmy();
    }
}

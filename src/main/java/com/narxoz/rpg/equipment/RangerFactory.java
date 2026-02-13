package com.narxoz.rpg.equipment;

public class RangerFactory implements EquipmentFactory {
    public Weapon createWeapon() { return new Longbow(); }
    public Armor createArmor() { return new LeatherArmor(); }
}

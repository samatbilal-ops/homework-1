package com.narxoz.rpg;

import com.narxoz.rpg.character.Archer;
import com.narxoz.rpg.character.Mage;
import com.narxoz.rpg.character.Warrior;
import com.narxoz.rpg.equipment.EquipmentFactory;
import com.narxoz.rpg.equipment.MagicFactory;
import com.narxoz.rpg.equipment.MedievalFactory;
import com.narxoz.rpg.equipment.RangerFactory;

public class Main {
    public static void main(String[] args) {

        Warrior warrior = new Warrior("Thor");
        Mage mage = new Mage("Gandalf");
        Archer archer = new Archer("Legolas");

        EquipmentFactory medieval = new MedievalFactory();
        EquipmentFactory magic = new MagicFactory();
        EquipmentFactory ranger = new RangerFactory();

        warrior.equipWeapon(medieval.createWeapon());
        warrior.equipArmor(medieval.createArmor());

        mage.equipWeapon(magic.createWeapon());
        mage.equipArmor(magic.createArmor());

        archer.equipWeapon(ranger.createWeapon());
        archer.equipArmor(ranger.createArmor());

        warrior.displayStats(); warrior.displayEquipment(); warrior.useSpecialAbility();
        mage.displayStats(); mage.displayEquipment(); mage.useSpecialAbility();
        archer.displayStats(); archer.displayEquipment(); archer.useSpecialAbility();
    }
}

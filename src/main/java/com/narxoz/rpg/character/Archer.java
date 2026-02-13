package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Archer implements Character {

    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    private Weapon weapon;
    private Armor armor;

    public Archer(String name) {
        this.name = name;
        this.health = 100;
        this.mana = 50;
        this.strength = 60;
        this.intelligence = 50;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getMana() { return mana; }
    public int getStrength() { return strength; }
    public int getIntelligence() { return intelligence; }

    public void displayStats() {
        System.out.println("=== " + name + " (Archer) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    public void useSpecialAbility() {
        System.out.println(name + " shoots MULTIPLE ARROWS! Hits several enemies!");
    }

    public void equipWeapon(Weapon weapon) { this.weapon = weapon; }
    public void equipArmor(Armor armor) { this.armor = armor; }

    public void displayEquipment() {
        System.out.println("Equipment:");
        if (weapon != null) weapon.displayInfo();
        if (armor != null) armor.displayInfo();
    }
}

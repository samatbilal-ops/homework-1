package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Warrior implements Character {

    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    private Weapon weapon;
    private Armor armor;

    public Warrior(String name) {
        this.name = name;
        this.health = 150;
        this.mana = 30;
        this.strength = 80;
        this.intelligence = 20;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getMana() { return mana; }
    public int getStrength() { return strength; }
    public int getIntelligence() { return intelligence; }

    public void displayStats() {
        System.out.println("=== " + name + " (Warrior) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    public void useSpecialAbility() {
        System.out.println(name + " uses BERSERKER RAGE! Strength temporarily increased!");
    }

    public void equipWeapon(Weapon weapon) { this.weapon = weapon; }
    public void equipArmor(Armor armor) { this.armor = armor; }

    public void displayEquipment() {
        System.out.println("Equipment:");
        if (weapon != null) weapon.displayInfo();
        if (armor != null) armor.displayInfo();
    }
}

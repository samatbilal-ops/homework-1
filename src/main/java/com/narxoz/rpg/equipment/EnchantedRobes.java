package com.narxoz.rpg.equipment;

public class EnchantedRobes implements Armor {

    private int defense;
    private String type;

    public EnchantedRobes() {
        this.defense = 15;
        this.type = "Robes";
    }

    public int getDefense() { return defense; }
    public String getArmorInfo() { return "Enchanted Robes (Magic) - Protects against spells"; }
    public String getArmorType() { return type; }

    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo() + " | Defense: " + defense);
    }
}

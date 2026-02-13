package com.narxoz.rpg.equipment;

public class LeatherArmor implements Armor {

    private int defense;
    private String type;

    public LeatherArmor() {
        this.defense = 25;
        this.type = "Leather Armor";
    }

    public int getDefense() { return defense; }
    public String getArmorInfo() { return "Leather Armor (Ranger) - Lightweight and flexible"; }
    public String getArmorType() { return type; }

    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo() + " | Defense: " + defense);
    }
}

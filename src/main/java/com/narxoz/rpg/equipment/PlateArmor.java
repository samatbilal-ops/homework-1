package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor {

    private int defense;
    private String type;

    public PlateArmor() {
        this.defense = 40;
        this.type = "Plate Armor";
    }

    public int getDefense() { return defense; }
    public String getArmorInfo() { return "Plate Armor (Medieval) - Heavy protection"; }
    public String getArmorType() { return type; }

    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo() + " | Defense: " + defense);
    }
}

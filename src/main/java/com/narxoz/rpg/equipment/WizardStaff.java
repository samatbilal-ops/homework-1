package com.narxoz.rpg.equipment;

public class WizardStaff implements Weapon {

    private int damage;
    private String weaponType;

    public WizardStaff() {
        this.damage = 15;
        this.weaponType = "Staff";
    }

    public int getDamage() { return damage; }
    public String getWeaponInfo() { return "Wizard Staff (Magic) - Boosts spells"; }
    public String getWeaponType() { return weaponType; }

    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo() + " | Damage: " + damage);
    }
}

package com.narxoz.rpg.equipment;

public class Longbow implements Weapon {

    private int damage;
    private String weaponType;

    public Longbow() {
        this.damage = 20;
        this.weaponType = "Bow";
    }

    public int getDamage() { return damage; }
    public String getWeaponInfo() { return "Longbow (Ranger) - Accurate ranged weapon"; }
    public String getWeaponType() { return weaponType; }

    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo() + " | Damage: " + damage);
    }
}

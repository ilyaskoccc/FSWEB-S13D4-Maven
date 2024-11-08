package org.example;

public enum Weapon {
    SWORD(10, 1.5),  // SWORD için damage ve attackSpeed değerleri
    AXE(15, 1.2),    // Diğer silah örneği
    BOW(8, 2.0);     // Diğer silah örneği

    private final int damage;
    private final double attackSpeed;

    // Constructor
    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    // Getter method for damage
    public int getDamage() {
        return damage;
    }

    // Getter method for attackSpeed
    public double getAttackSpeed() {
        return attackSpeed;
    }
}

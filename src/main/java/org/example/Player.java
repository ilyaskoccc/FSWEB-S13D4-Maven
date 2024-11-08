package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    // Constructor
    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = Math.min(100, Math.max(0, healthPercentage)); // healthPercentage sınırlandırması
        this.weapon = weapon;
    }

    // healthRemaining metodu: healthPercentage değerini döner
    public int healthRemaining() {
        return this.healthPercentage;
    }

    // loseHealth metodu: verilen damage miktarı kadar healthPercentage'ı azaltır
    public void loseHealth(int damage) {
        this.healthPercentage -= damage;
        if (this.healthPercentage <= 0) {
            this.healthPercentage = 0;
            System.out.println(this.name + " player has been knocked out of game");
        }
    }

    // restoreHealth metodu: verilen healthPotion miktarı kadar healthPercentage'ı artırır
    public void restoreHealth(int healthPotion) {
        this.healthPercentage += healthPotion;
        if (this.healthPercentage > 100) {
            this.healthPercentage = 100;
        }
    }
}

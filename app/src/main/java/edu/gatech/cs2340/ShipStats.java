package edu.gatech.cs2340;

import java.io.Serializable;

class ShipStats implements Serializable {
    private int health;
    private int fuel;
    private int speed;
    private int laser;
    private static final int initialSpeed = 50;
    private static final int initialLaser = 50;

    public ShipStats() {
        health = 100;
        fuel = 100;
        speed = initialSpeed;
        laser = initialLaser;
    }

    public void useFuel(double used) {
        fuel -= used;
    }

    public void refillFuel() {
        fuel = 100;
    }

    public void fixShip() {
        health = 100;
    }

    public void upgradeSpeed() {
        speed += 10;
    }

    public void upgradeLaser() {laser+= 10;}

    public void upgradeHealth() {}

    public int getFuel() { return fuel; }

    public int getHealth() { return health; }

    public void setHealth(int health) { this.health = health; }

    public int getSpeed() { return speed; }

    public int getLaser() { return laser; }

}

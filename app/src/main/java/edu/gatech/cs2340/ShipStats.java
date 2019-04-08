package edu.gatech.cs2340;

import java.io.Serializable;

class ShipStats implements Serializable {
    private int health;
    private int fuel;
    private final int speed;
    private final int laser;
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

    /*public void refillFuel(double fill) {
        fuel += fill;
    }

    public void healthLoss(int amount) {
        health -= amount;
    }

    public void fixShip() {
        health = 100;
    }

    public void upgradeSpeed() {
        speed += 10;
    } */

    public int getFuel() { return fuel; }

    public int getHealth() { return health; }

    public void setHealth(int health) { this.health = health; }

    public int getSpeed() { return speed; }

    public int getLaser() { return laser; }

}

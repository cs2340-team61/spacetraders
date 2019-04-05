package edu.gatech.cs2340;

import java.io.Serializable;

public class ShipStats implements Serializable {
    private int health;
    private int fuel;
    private int speed;
    private int laser;

    public ShipStats() {
        health = 100;
        fuel = 100;
        speed = 50;
        laser = 50;
    }

    public void useFuel(double used) {
        fuel -= used;
    }

    public void refillFuel(double fill) {
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
    }

    public int getFuel() { return fuel; }

    public int getHealth() { return health; }

    public void setHealth(int health) { this.health = health; }

    public int getSpeed() { return speed; }

    public int getLaser() { return laser; }

}

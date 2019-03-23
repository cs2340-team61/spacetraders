package edu.gatech.cs2340;

public class ShipStats {
    private int health;
    private int fuel;
    private int speed;

    public ShipStats() {
        health = 100;
        fuel = 100;
        speed = 50;
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

    public int getSpeed() { return speed; }
}

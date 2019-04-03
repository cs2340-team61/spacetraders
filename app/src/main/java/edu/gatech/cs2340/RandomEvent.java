package edu.gatech.cs2340;

import java.io.Serializable;
import java.util.Random;

public class RandomEvent implements Serializable {
    public boolean encounterPirates() {
        boolean value = false;
        Random random = new Random();
        int answer = random.nextInt(10);
        if (answer == 5) {
            value = true;
        }
        return value;

    }
    public boolean encounterPolice() {
        boolean value = false;
        Random random = new Random();
        int answer = random.nextInt(10);
        if (answer == 5) {
            value = true;
        }
        return value;
    }
    public boolean encounterTraders() {
        boolean value = false;
        Random random = new Random();
        int answer = random.nextInt(10);
        if (answer == 5) {
            value = true;
        }
        return value;
    }
}

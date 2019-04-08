package edu.gatech.cs2340;

import java.io.Serializable;

class Travel implements Serializable {

    public Travel() {}

    public int calculateDist(int x1, int x2, int y1, int y2) {
        return Math.round((float)(Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)))));
    }

    public int calculateFuel(int distance) {
        return distance / 5;
    }
}

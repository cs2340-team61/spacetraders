package edu.gatech.cs2340;

import java.io.Serializable;

class Travel implements Serializable {
    private static final int upper = 250;

    int calculateDist(int x1, int x2, int y1, int y2) {
        if ((x1 >= 0) && (x1 <= upper) && (y1 >= 0) && (y1 <= upper) && (x2 >= 0)
                && (x2 <= upper) && (y2 >= 0) && (y2 <= upper)) {
            return Math.round((float) (Math.sqrt(((x2 - x1) * (x2 - x1))
                    + ((y2 - y1) * (y2 - y1)))));
        }

        return -1;
    }

    int calculateFuel(int distance) {
        return distance / 5;
    }
}

package edu.gatech.cs2340;

import java.io.Serializable;

public enum Difficulty implements Serializable {
    Beginner ("Beginner"),
    Easy ("Easy"),
    Normal ("Normal"),
    Hard ("Hard"),
    Impossible ("Impossible");

    private final String diff;

    Difficulty(String diff) {
        this.diff = diff;
    }

    public String getDiff() {
        return diff;
    }
}

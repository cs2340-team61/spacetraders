package edu.gatech.cs2340;

/**
 * enum holding game difficulty values
 */
public enum Difficulty {
    Beginner ("Beginner"),
    Easy ("Easy"),
    Normal ("Normal"),
    Hard ("Hard"),
    Impossible ("Impossible");

    private final String diff;

    Difficulty(String diff) {
        this.diff = diff;
    }
    /**
     * Getter Method that returns difficulty
     */
    public String getDiff() {
        return diff;
    }
}

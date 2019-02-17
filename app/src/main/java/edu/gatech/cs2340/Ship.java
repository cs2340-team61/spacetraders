package edu.gatech.cs2340;

public enum Ship {
    Gnat ("Gnat");

    private final String shp;

    Ship(String shp) {
        this.shp = shp;
    }

    public String getShp() {
        return shp;
    }
}

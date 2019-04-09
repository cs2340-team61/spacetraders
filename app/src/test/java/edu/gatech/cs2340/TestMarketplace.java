package edu.gatech.cs2340;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestMarketplace {
    @Test
    public void testTechLevel() {
        Marketplace m = new Marketplace();
        m.techLevel("Pre-Agriculture");
        assertEquals(0, m.getLevel());
        m.techLevel("Agriculture");
        assertEquals(1, m.getLevel());
        m.techLevel("Medieval");
        assertEquals(2, m.getLevel());
        m.techLevel("Renaissance");
        assertEquals(3, m.getLevel());
        m.techLevel("Early Industrial");
        assertEquals(4, m.getLevel());
        m.techLevel("Industrial");
        assertEquals(5, m.getLevel());
        m.techLevel("Post-Industrial");
        assertEquals(6, m.getLevel());
        m.techLevel("Hi-Tech");
        assertEquals(7, m.getLevel());
        m.techLevel("Non-existent level");
        assertEquals(-1, m.getLevel());
    }
}

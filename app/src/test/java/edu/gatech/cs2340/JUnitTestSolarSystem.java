package edu.gatech.cs2340;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tester for Solar System
 * Sahej Gill
 * 4/8/2019
 */
public class JUnitTestSolarSystem {
    @Test
    public void Solar_System_made_right() {
        SolarSystem test = new SolarSystem(1, 0);
        assertEquals("Milky Way" ,test.getSsName());
        test = new SolarSystem(1, 1);
        assertEquals("Iridescent", test.getSsName());
    }

    @Test
    public void Correct_String_Returned(){
        SolarSystem test1 = new SolarSystem(1,-1);
        assertEquals(test1.getSsName(), null);
        SolarSystem test2 = new SolarSystem(0, 25);
        assertEquals(test2.getSsName(), null);
        
        
    }

}

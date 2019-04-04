package edu.gatech.cs2340;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Tester for Planet
 * @ Lewis Vaughan
 * 4/4/2019
 */
public class JUnitTest {
    @Test
    public void Coordinates_areCorrect() {
        Planet tester = new Planet(1, 3);
        assertEquals(1 , tester.getxPlanet());
        assertEquals(3 , tester.getyPlanet());
    }

    @Test
    public void IndexOutOfBounds_isThrown () {
        Planet tester = new Planet(1, 2);
        try {
            tester.createPlanet(-2, 4);
            fail();
        } catch (IndexOutOfBoundsException expected) {
            assertEquals("x and y cannot be negative", expected.getMessage());
        }
    }
    @Test
    public void TechLevelCorrect() {
        Planet tester = new Planet(1, 2);
        List<String> z = new ArrayList<String>();
        String[] a = {"Pre-Agriculture" ,"Agriculture", "Medieval", "Renaissance", "Early Industrial", "Industrial", "Post-Industrial", "Hi-Tech"};
        for(int i =  0; i < a.length; i++){
            z.add(a[i]);
        }
        assertTrue(z.contains(tester.getTechLevel()));
    }

    @Test
    public void RecourseLevelCorrect() {
        Planet tester = new Planet(3, 3);
        List<String> z = new ArrayList<String>();
        String[] a = {"No Special Resources" ,"Mineral Rich", "Mineral Poor", "Desert", "Lots of Water", "Rich Soil", "Poor Soil", "Rich Fauna", "Lifeless", "Weird Mushrooms", "Lots of Herbs", "Artistic", "Warlike"};
        for(int i =  0; i < a.length; i++){
            z.add(a[i]);
        }
        assertTrue(z.contains(tester.getResources()));
    }
}
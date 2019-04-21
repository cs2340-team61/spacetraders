package edu.gatech.cs2340;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tester for calculateDist() method in Travel
 * Neil Patel
 * 4/12/2019
 */
public class JUnitCalcDistanceTest {
    @Test
    public void negaticeCoordinateTest() {
        Travel travel = new Travel();

        int test = travel.calculateDist(-1, 10, 30, 50);
        assertEquals(-1, test);

        int test2 = travel.calculateDist(100, -1, 30, 50);
        assertEquals(-1, test2);

        int test3 = travel.calculateDist(20, 90, -1, 50);
        assertEquals(-1, test3);

        int test4 = travel.calculateDist(200, 10, 30, -1);
        assertEquals(-1, test4);
    }

    @Test
    public void upperBoundTest() {
        Travel travel = new Travel();

        int test = travel.calculateDist(10, 40, 100, 251);
        assertEquals(-1, test);

        int test2 = travel.calculateDist(10, 40, 251, 100);
        assertEquals(-1, test2);

        int test3 = travel.calculateDist(10, 251, 100, 160);
        assertEquals(-1, test3);

        int test4 = travel.calculateDist(251, 40, 100, 180);
        assertEquals(-1, test4);
    }

    @Test
    public void methodWorksTest() {
        Travel travel = new Travel();

        int test = travel.calculateDist(10, 40, 100, 250);
        assertEquals(153, test);

        int test2 = travel.calculateDist(10, 40, 250, 100);
        assertEquals(153, test2);

        int test3 = travel.calculateDist(10, 250, 100, 160);
        assertEquals(247, test3);

        int test4 = travel.calculateDist(250, 40, 100, 160);
        assertEquals(218, test4);

        int test8 = travel.calculateDist(10, 40, 100, 0);
        assertEquals(104, test8);

        int test5 = travel.calculateDist(10, 40, 0, 100);
        assertEquals(104, test5);

        int test6 = travel.calculateDist(10, 0, 100, 160);
        assertEquals(61, test6);

        int test7 = travel.calculateDist(0, 40, 100, 160);
        assertEquals(72, test7);


    }


}

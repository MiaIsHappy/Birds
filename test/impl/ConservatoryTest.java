package impl;

import bird.*;
import org.junit.Before;
import org.junit.Test;
import type.BirdsType;
import type.BodyOfWaterType;
import type.FavFoodType;

import static org.junit.Assert.*;

/**
 * Test conservatory with 6 diff types of birds
 * Test exceptions
 */
public class ConservatoryTest {

    Conservatory mConservatory;
    Bird preyBird_eagle;
    Bird flightlessBirds_emu;
    Bird owl1;
    Bird parrot1;
    Bird duck1;
    Bird flightlessBirds_moa;
    FavFoodType[] favFood = {FavFoodType.EGGS, FavFoodType.BUDS};

    @Before
    public void setUp() throws Exception {
        mConservatory = new Conservatory();
        preyBird_eagle = new PreyBird(BirdsType.PREY_BIRDS, "eagle1", false, 2, favFood, "eagle1 feature");
        flightlessBirds_emu = new FlightlessBird(BirdsType.FLIGHTLESS_BIRDS, "emu1", false, 0, favFood, "emu1 feature");
        owl1 = new Owls(BirdsType.OWLS, "owl1", false, 2, favFood, "owl1 feature");
        parrot1 = new Parrots(BirdsType.PARROTS, "parrot1", false, 2, favFood, "parrot1 feature");
        duck1 = new WaterfowlBird(BirdsType.WATERFOWL_BIRDS, "duck1", false, 2, favFood, "duck1 feature", BodyOfWaterType.WETLAND);
        flightlessBirds_moa = new FlightlessBird(BirdsType.FLIGHTLESS_BIRDS, "moa1", true, 0, favFood, "moa1 feature");
    }

    @Test
    public void testAddBird2Aviary() {
        mConservatory.addBird2Aviary(preyBird_eagle);
        mConservatory.addBird2Aviary(flightlessBirds_emu);
        mConservatory.addBird2Aviary(owl1);
        mConservatory.addBird2Aviary(parrot1);
        int res = mConservatory.addBird2Aviary(duck1);
        assertEquals(1, res);
    }

    @Test
    public void testAddBird2AviaryFailedAsFull() {
        for (int i = 0; i < 99; i++) {
            mConservatory.addBird2Aviary(preyBird_eagle);
        }
        int res = mConservatory.addBird2Aviary(flightlessBirds_emu);
        assertEquals(-1, res);

    }

    @Test
    public void testPrintFoodNeeded() {
        mConservatory.addBird2Aviary(preyBird_eagle);
        mConservatory.addBird2Aviary(flightlessBirds_emu);
        mConservatory.addBird2Aviary(owl1);
        mConservatory.addBird2Aviary(parrot1);
        String output = mConservatory.printFoodNeeded();
        assertEquals("{EGGS=4, BUDS=4}", output);
    }

    @Test
    public void testGetBirdLocationSuccess() {
        mConservatory.addBird2Aviary(preyBird_eagle);
        int res = mConservatory.getBirdLocation(preyBird_eagle);
        assertEquals(1, res);
    }

    @Test
    public void testGetBirdLocationFailed() {
        int res = mConservatory.getBirdLocation(preyBird_eagle);
        assertEquals(-1, res);
    }

    @Test
    public void testPrintAllAviariesInfo() {
        String expected = "All the aviaries by location and the birds they house: \n" +
                "Aviary 1: eagle1 \n" +
                "Aviary 2: emu1 \n" +
                "Aviary 3: owl1 parrot1 \n" +
                "Aviary 4: empty\n" +
                "Aviary 5: empty\n" +
                "Aviary 6: empty\n" +
                "Aviary 7: empty\n" +
                "Aviary 8: empty\n" +
                "Aviary 9: empty\n" +
                "Aviary 10: empty\n" +
                "Aviary 11: empty\n" +
                "Aviary 12: empty\n" +
                "Aviary 13: empty\n" +
                "Aviary 14: empty\n" +
                "Aviary 15: empty\n" +
                "Aviary 16: empty\n" +
                "Aviary 17: empty\n" +
                "Aviary 18: empty\n" +
                "Aviary 19: empty\n" +
                "Aviary 20: empty\n";
        mConservatory.addBird2Aviary(preyBird_eagle);
        mConservatory.addBird2Aviary(flightlessBirds_emu);
        mConservatory.addBird2Aviary(owl1);
        mConservatory.addBird2Aviary(parrot1);
        String output = mConservatory.printAllAviariesInfo();
        assertEquals(expected, output);
    }

    @Test
    public void testPrintBirdsInOrder() {
        String expect = "eagle1 : 1\n" +
                "emu1 : 2\n" +
                "owl1 : 3\n" +
                "parrot1 : 3\n";
        mConservatory.addBird2Aviary(preyBird_eagle);
        mConservatory.addBird2Aviary(flightlessBirds_emu);
        mConservatory.addBird2Aviary(owl1);
        mConservatory.addBird2Aviary(parrot1);
        String output = mConservatory.printBirdsInOrder();
        assertEquals(expect, output);
    }
}
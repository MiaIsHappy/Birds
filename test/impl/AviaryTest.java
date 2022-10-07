package impl;

import bird.*;
import org.junit.Before;
import org.junit.Test;
import type.BirdsType;
import type.BodyOfWaterType;
import type.FavFoodType;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Test an aviary with eagle, emu, owl, parrot, duck and moa. Tried to add to more than 5.
 * Test exceptions
 */
public class AviaryTest {

    Aviary mAviary;
    Bird preyBird_eagle;
    Bird flightlessBirds_emu;
    Bird owl1;
    Bird parrot1;
    Bird duck1;
    Bird flightlessBirds_moa;
    FavFoodType[] favFood = {FavFoodType.EGGS, FavFoodType.BUDS};

    @Before
    public void setUp() throws Exception {
        mAviary = new Aviary(1);
        preyBird_eagle = new PreyBird(BirdsType.PREY_BIRDS, "eagle1", false, 2, favFood, "eagle1 feature");
        flightlessBirds_emu = new FlightlessBird(BirdsType.FLIGHTLESS_BIRDS, "emu1", false, 0, favFood, "emu1 feature");
        owl1 = new Owls(BirdsType.OWLS, "owl1", false, 2, favFood, "owl1 feature");
        parrot1 = new Parrots(BirdsType.PARROTS, "parrot1", false, 2, favFood, "parrot1 feature");
        duck1 = new WaterfowlBird(BirdsType.WATERFOWL_BIRDS, "duck1", false, 2, favFood, "duck1 feature", BodyOfWaterType.WETLAND);
        flightlessBirds_moa = new FlightlessBird(BirdsType.FLIGHTLESS_BIRDS, "moa1", true, 0, favFood, "moa1 feature");
    }

    @Test
    public void testAddBirdSucceed1() {
        int res = mAviary.addBird(preyBird_eagle);
        assertEquals(1, res);
    }

    @Test
    public void testAddBirdSucceed2() {
        mAviary.addBird(duck1);
        int res = mAviary.addBird(duck1);
        assertEquals(2, res);
    }

    @Test
    public void testAddBirdFailed1() {
        mAviary.addBird(preyBird_eagle);
        int res = mAviary.addBird(flightlessBirds_emu);
        assertEquals(-1, res);
    }

    @Test
    public void testAddBirdFailed2() {
        mAviary.addBird(flightlessBirds_emu);
        int res = mAviary.addBird(preyBird_eagle);
        assertEquals(-1, res);
    }

    @Test
    public void testAddBirdFailed3() {
        mAviary.addBird(flightlessBirds_emu);
        int res = mAviary.addBird(duck1);
        assertEquals(-1, res);
    }

    @Test
    public void testAddBirdFailed4() {
        mAviary.addBird(flightlessBirds_emu);
        mAviary.addBird(flightlessBirds_emu);
        mAviary.addBird(flightlessBirds_emu);
        mAviary.addBird(flightlessBirds_emu);
        mAviary.addBird(flightlessBirds_emu);
        int res = mAviary.addBird(flightlessBirds_emu);
        assertEquals(-1, res);
    }

    @Test
    public void testAddBirdFailed5() {
        int res = mAviary.addBird(flightlessBirds_moa);
        assertEquals(-1, res);
    }

    @Test
    public void testAddBirdFailed6() {
        mAviary.addBird(preyBird_eagle);
        int res = mAviary.addBird(parrot1);
        assertEquals(-1, res);
    }

    @Test
    public void testIsAviaryFull() {
        mAviary.addBird(preyBird_eagle);
        mAviary.addBird(preyBird_eagle);
        mAviary.addBird(preyBird_eagle);
        mAviary.addBird(preyBird_eagle);
        mAviary.addBird(preyBird_eagle);
        assertEquals(true, mAviary.isAviaryFull());
    }

    @Test
    public void testIsAviaryAllSameTypeBird() {
        mAviary.addBird(owl1);
        mAviary.addBird(parrot1);
        assertEquals(false, mAviary.isAviaryAllSameTypeBird(BirdsType.PARROTS));
    }

    @Test
    public void testPrintAviarySign1() {
        String output = mAviary.printAviarySign();
        assertEquals("The aviary is empty now", output);
    }

    @Test
    public void testPrintAviarySign2() {
        mAviary.addBird(owl1);
        mAviary.addBird(parrot1);
        String output = mAviary.printAviarySign();
        String expected = "Birds in this aviary: owl1, parrot1\n" +
                "owl1's feature: owl1 feature\n" +
                "parrot1's feature: parrot1 feature\n";
        assertEquals(expected, output);
    }

    @Test
    public void testGetLocationId() {
        assertEquals(1, mAviary.getLocationId());
    }

    @Test
    public void testIsEmpty() {
        assertEquals(true, mAviary.isAviaryEmpty());
    }

    @Test
    public void testGetHousedBirds() {
        mAviary.addBird(parrot1);
        List<Bird> housedBirds = mAviary.getHousedBirds();
        assertEquals(housedBirds.get(0), parrot1);
    }
}
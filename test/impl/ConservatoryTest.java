package impl;

import bird.*;
import org.junit.Before;
import org.junit.Test;
import type.BirdsType;
import type.BodyOfWaterType;
import type.FavFoodType;

import static org.junit.Assert.*;

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
        mConservatory.printFoodNeeded();
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
        mConservatory.addBird2Aviary(preyBird_eagle);
        mConservatory.addBird2Aviary(flightlessBirds_emu);
        mConservatory.addBird2Aviary(owl1);
        mConservatory.addBird2Aviary(parrot1);
        mConservatory.printAllAviariesInfo();
    }

    @Test
    public void testPrintBirdsInOrder() {
        mConservatory.addBird2Aviary(preyBird_eagle);
        mConservatory.addBird2Aviary(flightlessBirds_emu);
        mConservatory.addBird2Aviary(owl1);
        mConservatory.addBird2Aviary(parrot1);
        mConservatory.printBirdsInOrder();
    }
}
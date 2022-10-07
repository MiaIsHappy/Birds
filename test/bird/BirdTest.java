package bird;

import org.junit.Before;
import org.junit.Test;
import type.BirdsType;
import type.FavFoodType;

import static org.junit.Assert.*;

/**
 * Test an eagle with favorite food of edds and buds.
 * Test exceptions
 */
public class BirdTest {

    Bird mBird;
    FavFoodType[] favFood = {FavFoodType.EGGS, FavFoodType.BUDS};
    String feature;
    String mBirdName;

    @Before
    public void setUp() throws Exception {
        feature = "Birds of prey all have sharp hooked beaks with visible nostrils";
        mBirdName = "eagle";
        mBird = new PreyBird(BirdsType.PREY_BIRDS, mBirdName, false, 2, favFood, feature);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsNumOfWingsValid() {
        Bird bird = new Parrots(BirdsType.PARROTS, "bird3", false, 1, favFood, "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsFlightlessBirdsNumOfWingsValid() {
        Bird bird = new FlightlessBird(BirdsType.FLIGHTLESS_BIRDS, "bird2", false, 2, favFood, "");
    }

    @Test
    public void testGetType() {
        assertEquals(mBird.getType(), BirdsType.PREY_BIRDS);
    }

    @Test
    public void testIsExtinct() {
        assertEquals(mBird.isExtinct(), false);
    }

    @Test
    public void testGetFavFood() {
        FavFoodType[] favFood = {FavFoodType.EGGS, FavFoodType.BUDS};
        FavFoodType[] bird1FavFood = mBird.getFavFood();
        for (int i = 0; i < bird1FavFood.length; i++) {
            assertEquals(bird1FavFood[i], favFood[i]);
        }
    }

    @Test
    public void testGetFeature() {
        assertEquals(feature, mBird.getFeature());

    }

    @Test
    public void testGetName() {
        assertEquals(mBirdName, mBird.getName());
    }

}
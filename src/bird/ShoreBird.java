package bird;

import type.BirdsType;
import type.BodyOfWaterType;
import type.FavFoodType;

/**
 * Shorebirds include the great auk, horned puffin, and African Jacana.
 * They live near water sources including wetlands, freshwater and saltwater shorelands, even the ocean.
 */
public class ShoreBird extends BirdLiveByWater {
    public ShoreBird(BirdsType type, String name, boolean isExtinct, int numberOfWings, FavFoodType[] favFood, String feature, BodyOfWaterType bodyOfWaterType) {
        super(type, name, isExtinct, numberOfWings, favFood, feature, bodyOfWaterType);
    }

    /**
     * All shore birds can fly
     * @return true
     */
    @Override
    public boolean canFly() {
        return true;
    }
}

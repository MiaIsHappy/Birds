package bird;

import type.BirdsType;
import type.BodyOfWaterType;
import type.FavFoodType;

public class ShoreBird extends BirdLiveByWater {
    public ShoreBird(BirdsType type, String name, boolean isExtinct, int numberOfWings, FavFoodType[] favFood, String feature, BodyOfWaterType bodyOfWaterType) {
        super(type, name, isExtinct, numberOfWings, favFood, feature, bodyOfWaterType);
    }

    @Override
    public boolean canFly() {
        return true;
    }
}

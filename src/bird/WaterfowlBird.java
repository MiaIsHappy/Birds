package bird;

import type.BirdsType;
import type.BodyOfWaterType;
import type.FavFoodType;

public class WaterfowlBird extends BirdLiveByWater {
    public WaterfowlBird(BirdsType type, String name, boolean isExtinct, int numberOfWings, FavFoodType[] favFood, String feature, BodyOfWaterType bodyOfWaterType) {
        super(type, name, isExtinct, numberOfWings, favFood, feature, bodyOfWaterType);
    }

    @Override
    public boolean canFly() {
        return true;
    }
}

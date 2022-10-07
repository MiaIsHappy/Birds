package bird;

import type.BirdsType;
import type.BodyOfWaterType;
import type.FavFoodType;

/**
 * Waterfowl are another classification that live near water sources (fresh or salt) and include ducks, swans, and geese.
 */
public class WaterfowlBird extends BirdLiveByWater {
    public WaterfowlBird(BirdsType type, String name, boolean isExtinct, int numberOfWings, FavFoodType[] favFood, String feature, BodyOfWaterType bodyOfWaterType) {
        super(type, name, isExtinct, numberOfWings, favFood, feature, bodyOfWaterType);
    }

    /**
     * All waterfowl can fly
     * @return
     */
    @Override
    public boolean canFly() {
        return true;
    }
}

package bird;

import type.BirdsType;
import type.BodyOfWaterType;
import type.FavFoodType;

public abstract class BirdLiveByWater extends Bird {
    private BodyOfWaterType bodyOfWaterType;

    public BirdLiveByWater(BirdsType type, String name, boolean isExtinct,
                           int numberOfWings, FavFoodType[] favFood, String feature, BodyOfWaterType bodyOfWaterType) {
        super(type, name, isExtinct, numberOfWings, favFood, feature);
        this.bodyOfWaterType = bodyOfWaterType;
    }

    public BodyOfWaterType getBodyOfWaterType() {
        return bodyOfWaterType;
    }

    public void setBodyOfWaterType(BodyOfWaterType bodyOfWaterType) {
        this.bodyOfWaterType = bodyOfWaterType;
    }
}

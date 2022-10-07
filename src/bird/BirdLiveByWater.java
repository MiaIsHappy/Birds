package bird;

import type.BirdsType;
import type.BodyOfWaterType;
import type.FavFoodType;

/**
 * Abstract class for water bird.
 */
public abstract class BirdLiveByWater extends Bird {
    private BodyOfWaterType bodyOfWaterType;

    /**
     * Constructor that takes 7 parameters
     * @param type
     * @param name
     * @param isExtinct
     * @param numberOfWings
     * @param favFood
     * @param feature
     * @param bodyOfWaterType
     */
    public BirdLiveByWater(BirdsType type, String name, boolean isExtinct,
                           int numberOfWings, FavFoodType[] favFood, String feature, BodyOfWaterType bodyOfWaterType) {
        super(type, name, isExtinct, numberOfWings, favFood, feature);
        this.bodyOfWaterType = bodyOfWaterType;
    }

    /**
     * Getter for BodyOfWaterType
     * @return BodyOfWaterType
     */
    public BodyOfWaterType getBodyOfWaterType() {
        return bodyOfWaterType;
    }

    /**
     * Setter for BodyOfWaterType
     * @param bodyOfWaterType
     */
    public void setBodyOfWaterType(BodyOfWaterType bodyOfWaterType) {
        this.bodyOfWaterType = bodyOfWaterType;
    }
}

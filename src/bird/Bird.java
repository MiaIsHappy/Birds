package bird;

import type.BirdsType;
import type.FavFoodType;

/**
 *  Birds are defined as warm-blooded, bipedal,
 *  vertebrate animals who have two wings instead of arms
 */
public abstract class Bird implements BirdInterface {
    private BirdsType type;
    private String name;
    private boolean isExtinct;
    private int numberOfWings;
    private FavFoodType[] favFood;
    private String feature;

    public Bird(BirdsType type, String name, boolean isExtinct, int numberOfWings,
                FavFoodType[] favFood, String feature) {
        if (numberOfWings < 0 || numberOfWings % 2 != 0) {
            throw new IllegalArgumentException();
        }
        this.type = type;
        this.name = name;
        this.isExtinct = isExtinct;
        this.numberOfWings = numberOfWings;
        this.favFood = favFood;
        this.feature = feature;
    }

    public BirdsType getType() {
        return type;
    }

    public boolean isExtinct() {
        return isExtinct;
    }

    public FavFoodType[] getFavFood() {
        return favFood;
    }

    public String getFeature() {
        return feature;
    }

    public String getName() {
        return name;
    }

    public abstract boolean canFly();


}

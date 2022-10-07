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

    /**
     * Bird constructor with six parameters. Default constructor
     * @param type
     * @param name
     * @param isExtinct
     * @param numberOfWings
     * @param favFood
     * @param feature
     */
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

    /**
     * Getter for type
     * @return typpe
     */
    public BirdsType getType() {
        return type;
    }

    /**
     * Getter for isExtinct
     * @return isExtinct
     */
    public boolean isExtinct() {
        return isExtinct;
    }

    /**
     * Getter for favFood
     * @return favFood
     */
    public FavFoodType[] getFavFood() {
        return favFood;
    }

    /**
     * Getter for feature
     * @return feature
     */
    public String getFeature() {
        return feature;
    }

    /**
     * Getter for name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * abstract class if a bird can fly.
     * @return boolean
     */
    public abstract boolean canFly();


}

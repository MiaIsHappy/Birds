package bird;

import type.BirdsType;
import type.FavFoodType;

/**
 * Birds of prey all have sharp, hooked beaks with visible nostrils. They include hawks, eagles, and osprey.
 */
public class PreyBird extends Bird {
    public PreyBird(BirdsType type, String name, boolean isExtinct, int numberOfWings, FavFoodType[] favFood, String feature) {
        super(type, name, isExtinct, numberOfWings, favFood, feature);
    }

    /**
     * All preys can fly
     * @return
     */
    @Override
    public boolean canFly() {
        return true;
    }
}

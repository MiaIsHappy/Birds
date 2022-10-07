package bird;

import type.BirdsType;
import type.FavFoodType;

/**
 * Owls are distinguished by the facial disks that frame the eyes and bill.
 */
public class Owls extends Bird {

    /**
     * Owls constructor that takes 6 parameters.
     * @param type
     * @param name
     * @param isExtinct
     * @param numberOfWings
     * @param favFood
     * @param feature
     */
    public Owls(BirdsType type, String name, boolean isExtinct, int numberOfWings, FavFoodType[] favFood, String feature) {
        super(type, name, isExtinct, numberOfWings, favFood, feature);
    }

    /**
     * All owls can fly
     * @return  true
     */
    @Override
    public boolean canFly() {
        return true;
    }
}

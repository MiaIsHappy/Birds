package bird;

import type.BirdsType;
import type.FavFoodType;

/**
 * Pigeons (or doves) are known for feeding their young "bird milk" very similar to the milk of mammals.
 * Found all over the world, there are several varieties that are extinct.
 */
public class Pigeons extends Bird {
    public Pigeons(BirdsType type, String name, boolean isExtinct, int numberOfWings, FavFoodType[] favFood, String feature) {
        super(type, name, isExtinct, numberOfWings, favFood, feature);
    }

    /**
     * All Pigeons can fly
     * @return true
     */
    @Override
    public boolean canFly() {
        return true;
    }
}

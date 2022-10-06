package bird;

import type.BirdsType;
import type.FavFoodType;

public class Pigeons extends Bird {
    public Pigeons(BirdsType type, String name, boolean isExtinct, int numberOfWings, FavFoodType[] favFood, String feature) {
        super(type, name, isExtinct, numberOfWings, favFood, feature);
    }

    @Override
    public boolean canFly() {
        return true;
    }
}

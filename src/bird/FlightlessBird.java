package bird;

import type.BirdsType;
import type.FavFoodType;

public class FlightlessBird extends Bird {

    public FlightlessBird(BirdsType type, String name, boolean isExtinct, int numberOfWings, FavFoodType[] favFood, String feature) {
        super(type, name, isExtinct, numberOfWings, favFood, feature);
        if (numberOfWings != 0) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public boolean canFly() {
        return false;
    }
}

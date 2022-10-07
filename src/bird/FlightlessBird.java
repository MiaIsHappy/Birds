package bird;

import type.BirdsType;
import type.FavFoodType;

/**
 * Flightless bird Flightless birds live on the ground and have no (or undeveloped) wings.
 * They include the emus, kiwis, and moas. Some (but not all) of these birds are extinct.
 */
public class FlightlessBird extends Bird {

    /**
     * Constructor for FlightlessBird that takes 6 parameters
     * @param type
     * @param name
     * @param isExtinct
     * @param numberOfWings
     * @param favFood
     * @param feature
     */
    public FlightlessBird(BirdsType type, String name, boolean isExtinct, int numberOfWings, FavFoodType[] favFood, String feature) {
        super(type, name, isExtinct, numberOfWings, favFood, feature);
        if (numberOfWings != 0) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Flightless bird cannot fly
     * @return false
     */
    @Override
    public boolean canFly() {
        return false;
    }
}

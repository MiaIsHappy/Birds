package bird;

import type.BirdsType;
import type.FavFoodType;

/**
 * Interface for all bird. Every bird has the same five methods
 */
public interface BirdInterface {


    BirdsType getType();

    boolean isExtinct();

    FavFoodType[] getFavFood();

    String getFeature();

    String getName();
}

package bird;

import type.BirdsType;
import type.FavFoodType;

public interface BirdInterface {

    BirdsType getType();

    boolean isExtinct();

    FavFoodType[] getFavFood();

    String getFeature();

    String getName();
}

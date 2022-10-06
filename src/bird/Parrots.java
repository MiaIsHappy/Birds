package bird;

import type.BirdsType;
import type.FavFoodType;

public class Parrots extends Bird {
    private int vocabulary;
    private String favSaying;

    public Parrots(BirdsType type, String name, boolean isExtinct, int numberOfWings, FavFoodType[] favFood, String feature) {
        super(type, name, isExtinct, numberOfWings, favFood, feature);
    }

    public int getVocabulary() {
        return vocabulary;
    }

    public void setVocabulary(int vocabulary) {
        this.vocabulary = vocabulary;
    }

    public String getFavSaying() {
        return favSaying;
    }

    public void setFavSaying(String favSaying) {
        this.favSaying = favSaying;
    }

    @Override
    public boolean canFly() {
        return true;
    }
}

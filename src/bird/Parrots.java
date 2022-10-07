package bird;

import type.BirdsType;
import type.FavFoodType;

/**
 * Parrots have a short, curved beak and are known for their intelligence and ability to mimic sounds.
 * Many pet parrots can learn a vocabulary of up to 100 words and often adopt a single "favorite" saying.
 * They include the rose-ring parakeet, gray parrot, and sulfur-crested cockatoo.
 */
public class Parrots extends Bird {
    private int vocabulary;
    private String favSaying;

    /**
     * Constructor that takes all parameters
     * @param type
     * @param name
     * @param isExtinct
     * @param numberOfWings
     * @param favFood
     * @param feature
     */
    public Parrots(BirdsType type, String name, boolean isExtinct, int numberOfWings, FavFoodType[] favFood, String feature) {
        super(type, name, isExtinct, numberOfWings, favFood, feature);
    }

    /**
     * Getter for vocabulary
     * @return
     */
    public int getVocabulary() {
        return vocabulary;
    }

    /**
     * Setter for vocabulary
     * @param vocabulary
     */
    public void setVocabulary(int vocabulary) {
        this.vocabulary = vocabulary;
    }

    /**
     * Getter for favoSaying
     * @return
     */
    public String getFavSaying() {
        return favSaying;
    }

    /**
     * Setter for favoSaying
     * @param favSaying
     */
    public void setFavSaying(String favSaying) {
        this.favSaying = favSaying;
    }

    /**
     * Parrots can always fly
     * @return
     */
    @Override
    public boolean canFly() {
        return true;
    }
}

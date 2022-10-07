package impl;

import bird.Bird;
import type.BirdsType;

import java.util.ArrayList;
import java.util.List;


/**
 * Aviary is used to house birds
 * Allow you to rescue new birds and bring them into your conservatory
 * Calculate what food needs to be kept and in what quantities
 * Assign a bird to an aviary in the conservatory. Assignments must follow the following criteria:
 * There is a maximum of 20 aviaries in the conservatory
 * Any bird can be inserted into an empty aviary
 * No aviary can house more than 5 birds
 * No extinct birds can be added to an aviary
 * Flightless birds, birds of prey, and waterfowl should not be mixed with other bird types
 */
public class Aviary {
    private static final int MAX_NUMBER_OF_BIRDS = 5;
    private List<Bird> mBirds = new ArrayList<>(MAX_NUMBER_OF_BIRDS);
    private int locationId;

    public Aviary(int locationId) {
        this.locationId = locationId;
    }

    /**
     * Add bird to the aviary
     * Any bird can be inserted into an empty aviary
     * No aviary can house more than 5 birds
     * No extinct birds can be added to an aviary
     * Flightless birds, birds of prey, and waterfowl should not be mixed with other bird types
     * @param bird
     * @return add failed return -1, otherwise return the size of birds after add
     */
    public int addBird(Bird bird) {
        //No aviary can house more than 5 birds
        //No extinct birds can be added to an aviary
        if (isAviaryFull() || bird.isExtinct()) {
            return -1;
        }
        //Flightless birds, birds of prey, and waterfowl should not be mixed with other bird types
        BirdsType type = bird.getType();
        if (type != BirdsType.FLIGHTLESS_BIRDS && type != BirdsType.PREY_BIRDS && type != BirdsType.WATERFOWL_BIRDS) {
            if (isAviaryContainsSpecialBirds()) {
                return -1;
            } else {
                mBirds.add(bird);
            }
        } else {
            if (!isAviaryAllSameTypeBird(type)) {
                return -1;
            } else {
                mBirds.add(bird);
            }
        }

        return mBirds.size();
    }

    private boolean isAviaryContainsSpecialBirds() {
        for (Bird bird : mBirds) {
            BirdsType type = bird.getType();
            if (type == BirdsType.FLIGHTLESS_BIRDS || type == BirdsType.PREY_BIRDS || type == BirdsType.WATERFOWL_BIRDS) {
                return true;
            }
        }
        return false;
    }

    /**
     * is Aviary Full
     *
     * @return
     */
    public boolean isAviaryFull() {
        return mBirds.size() == MAX_NUMBER_OF_BIRDS;
    }

    /**
     * Judge if the aviary contains the same type birds
     * @param type the bird type
     * @return true if all bird type is same, otherwise false
     */
    public boolean isAviaryAllSameTypeBird(BirdsType type) {
        boolean flightlessBirdFlag = true;
        for (Bird bird : mBirds) {
            if (bird.getType() != type) {
                flightlessBirdFlag = false;
                break;
            }
        }
        return flightlessBirdFlag;
    }

    /**
     * Print a sign for any given aviary that gives a description of the birds
     * it houses and any interesting information that it may have about that animal.
     */
    public String printAviarySign() {
        // Birds in this aviary: xx
        // xx's feature: xxx
        if (mBirds.size() == 0) {
            //System.out.println("The aviary is empty now");
            return "The aviary is empty now";
        } else {
            StringBuilder sb = new StringBuilder("Birds in this aviary: ");
            for (int i = 0; i < mBirds.size(); i++) {
                if (i == mBirds.size() - 1) {
                    sb.append(mBirds.get(i).getName()).append("\n");
                } else {
                    sb.append(mBirds.get(i).getName()).append(", ");
                }
            }
            // print each bird's feature and favFood
            for (Bird bird : mBirds) {
                sb.append(bird.getName()).append("\'").append("s").append(" feature: ")
                        .append(bird.getFeature()).append("\n");
            }
            //System.out.println(sb.toString());
            return sb.toString();
        }
    }

    /**
     * Getter for locationId;
     * @return locationId;
     */
    public int getLocationId() {
        return locationId;
    }

    /**
     * Getter for isEmpty
     * @return isEmpty
     */
    public boolean isAviaryEmpty() {
        return mBirds.size() == 0;
    }

    /**
     * Getter for types of birds
     * @return birds
     */
    public List<Bird> getHousedBirds() {
        List<Bird> birds = new ArrayList<>(mBirds);
        return birds;
    }
}

package impl;

import bird.Bird;
import type.BirdsType;
import type.FavFoodType;

import java.util.*;

/**
 * Conservatory that  that represents a conservatory that houses many different types of birds. The conservatory is broken into various aviaries.
 */
public class Conservatory {
    private static final int MAX_NUMBER_OF_AVIARIES = 20;
    private List<Aviary> mAviaries;
    private Map<Bird, Integer> mBirdLocationMap = new HashMap<>();
    private Map<FavFoodType, Integer> mFoodTypeCountMap = new HashMap<>();

    /**
     * Default constructor for conservatory
     */
    public Conservatory() {
        mAviaries = new ArrayList<>(MAX_NUMBER_OF_AVIARIES);
        for (int i = 0; i < MAX_NUMBER_OF_AVIARIES; i++) {
            mAviaries.add(new Aviary(i + 1));
        }
    }

    /**
     * Calculate what food needs to be kept and in what quantities
     */
    public void printFoodNeeded() {
        System.out.println(mFoodTypeCountMap);
    }

    /**
     * Have a guest look up which aviary a bird is in
     *
     * @param bird target
     * @return if not found, return -1. Otherwise return the location
     */
    public int getBirdLocation(Bird bird) {
        if (mBirdLocationMap.containsKey(bird)) {
            return mBirdLocationMap.get(bird);
        } else {
            return -1;
        }
    }

    /**
     * Assign a bird to an aviary in the conservatory
     *
     * @param bird
     * @return add failed return -1, otherwise return 1
     */
    public int addBird2Aviary(Bird bird) {
        BirdsType birdsType = bird.getType();
        for (int i = 0; i < mAviaries.size(); i++) {
            Aviary curAviary = mAviaries.get(i);
            if (curAviary.isAviaryFull()) {
                continue;
            } else {
                int res = curAviary.addBird(bird);
                if (res == -1) {
                    if (i == mAviaries.size() - 1) {
                        return -1;
                    } else {
                        continue;
                    }
                } else {
                    mBirdLocationMap.put(bird, curAviary.getLocationId());
                    FavFoodType[] food = bird.getFavFood();
                    for (FavFoodType f : food) {
                        mFoodTypeCountMap.put(f, mFoodTypeCountMap.getOrDefault(f, 0) + 1);
                    }
                    return 1;
                }
            }
        }
        return 1;
    }

    /*private boolean isConservatoryFull() {
        return mAviaries.size() == MAX_NUMBER_OF_AVIARIES;
    }*/

    /**
     * Print a “map” that lists all the aviaries by location and the birds they house
     */
    public void printAllAviariesInfo() {
        // AviaryLocationId: xxx
        StringBuilder sb = new StringBuilder("All the aviaries by location and the birds they house: \n");
        for (int i = 0; i < mAviaries.size(); i++) {
            Aviary curAviary = mAviaries.get(i);
            int id = curAviary.getLocationId();
            sb.append("Aviary ").append(id).append(": ");
            if (curAviary.isAviaryEmpty()) {
                sb.append("empty").append("\n");
            } else {
                List<Bird> birds = curAviary.getHousedBirds();
                for (Bird bird : birds) {
                    sb.append(bird.getName()).append(" ");
                }
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }

    /**
     * Print an index that lists all birds in the conservatory in alphabetical order and their location
     */
    public void printBirdsInOrder() {
        Set<Map.Entry<Bird, Integer>> entries = mBirdLocationMap.entrySet();
        List<Map.Entry<Bird, Integer>> list = new ArrayList<>(entries);
        list.sort(new Comparator<Map.Entry<Bird, Integer>>() {
            @Override
            public int compare(Map.Entry<Bird, Integer> o1, Map.Entry<Bird, Integer> o2) {
                return o1.getKey().getName().compareTo(o2.getKey().getName());
            }
        });

        for (Map.Entry<Bird, Integer> birdEntry : list) {
            System.out.println(birdEntry.getKey().getName() + " : " + birdEntry.getValue());
        }

    }
}

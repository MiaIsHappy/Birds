import bird.Bird;
import bird.PreyBird;
import bird.WaterfowlBird;
import impl.Conservatory;
import type.BirdsType;
import type.BodyOfWaterType;
import type.FavFoodType;

public class Main {
    public static void main(String[] args) {

        FavFoodType[] eagleFavFood = {FavFoodType.EGGS, FavFoodType.BUDS};
        Bird eagle = new PreyBird(BirdsType.PREY_BIRDS, "eagle", false, 2, eagleFavFood, "Birds of prey all have sharp, " +
                "hooked beaks with visible nostrils");

        Bird eagle2 = new PreyBird(BirdsType.PREY_BIRDS, "eagle2", false, 2, eagleFavFood, "Birds of prey all have sharp," +
                " " +
                "hooked beaks with visible nostrils");

        Bird duck  = new WaterfowlBird(BirdsType.WATERFOWL_BIRDS, "duck", false, 2, eagleFavFood, "", BodyOfWaterType.WETLAND);

        Bird duck2  = new WaterfowlBird(BirdsType.WATERFOWL_BIRDS, "duck2", false, 2, eagleFavFood, "", BodyOfWaterType.WETLAND);

        Conservatory conservatory = new Conservatory();
        conservatory.addBird2Aviary(eagle);
        conservatory.addBird2Aviary(eagle2);
        conservatory.addBird2Aviary(duck);
        conservatory.addBird2Aviary(duck2);
        conservatory.printFoodNeeded();
        conservatory.printAllAviariesInfo();
        conservatory.printBirdsInOrder();


    }
}
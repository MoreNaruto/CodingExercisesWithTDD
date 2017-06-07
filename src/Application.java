import Exercises.ArrayAndListExercises;

/**
 * Created by tmosq on 6/6/17.
 */
public class Application {
    public static void main(String[] args){
        ArrayAndListExercises arrayAndListExercises = new ArrayAndListExercises();

        System.out.println("The word frown: " + arrayAndListExercises.allUniqueCharacters("frown"));
        System.out.println("The word upper: " + arrayAndListExercises.allUniqueCharacters("upper"));
    }
}

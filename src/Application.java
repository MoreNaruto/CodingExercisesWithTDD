import Exercises.ArrayAndListExercises;

/**
 * Created by tmosq on 6/6/17.
 */
public class Application {
    public static void main(String[] args){
        ArrayAndListExercises arrayAndListExercises = new ArrayAndListExercises();

        System.out.println("WORDS WITH UNIQUE CHARACTERS");
        System.out.println("------------------------------");
        System.out.println("The word frown: " + arrayAndListExercises.allUniqueCharacters("frown"));
        System.out.println("The word upper: " + arrayAndListExercises.allUniqueCharacters("upper"));
        System.out.println();

        System.out.println("WORDS THAT ARE PERMUTATIONS OF EACH OTHER");
        System.out.println("------------------------------");
        System.out.println("The words line and nile: " + arrayAndListExercises.wordPermutations("line", "nile"));
        System.out.println("The words cookie and wig: " + arrayAndListExercises.wordPermutations("cookie", "wig"));
    }
}

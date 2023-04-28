import java.util.ArrayList;

public class ArrayListExercises {
    public static void main(String[] args) {

        ArrayList<String> words  = new ArrayList<>();
        words.add("course");
        words.add("course 2");
        words.add("course 3");

        for (String word : words){
            System.out.print(word + " ");
        }
        System.out.println();

        words.remove(2);

        for (String word : words){
            System.out.print(word + " ");
        }
        System.out.println();

        words.add(1, "random");

        for (String word : words){
            System.out.print(word + " ");
        }
        System.out.println();
    }
}

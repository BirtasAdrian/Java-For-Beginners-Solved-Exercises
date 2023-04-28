import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListExercises2 {
    public static void main(String[] args) {

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(34);
//        numbers.add(54);
//        numbers.add(6);
//        numbers.add(-55);
//        numbers.add(88);
//        numbers.add(55);
//
//        Collections.sort(numbers);

//        for(int number : numbers){
//            System.out.println(number);
//        }

//        ArrayList<String> list = new ArrayList<>(Arrays.asList("test 1", "test 2", "java"));

//        for(String item : list){
//            System.out.println(item);
//        }
//        Here we invert the list
//      for (int i = list.size()-1; i>=0; i--){
//          System.out.println(list.get(i));
//      }

        ArrayList<Double> doubleNumber = new ArrayList<>(Arrays.asList(5.6, 7.7));

      for(int i = doubleNumber.size()-1; i>=0; i--){
          System.out.println(doubleNumber.get(i));

//      for(double Number : doubleNumber){
//          System.out.println(Number);
      }
    }
}

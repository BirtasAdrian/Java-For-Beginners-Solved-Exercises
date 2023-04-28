import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayListExercises1a {
    public static void main(String[] args) {

//        1. Declare a list named characters that contains the following values:
//        Luke Skywalker, Han Solo and Lasagna.
//        After that, insert the value Darth Vader, and then delete the second element
//        Print the list in 2 different ways.

//        ArrayList<String> characters = new ArrayList<>();
//        characters.add("Luke Skywalker");
//        characters.add("Han Solo");
//        characters.add("Lasagna");
//        characters.add("Darth Vader");
//        characters.remove(1);
//
//        for (int i = 0; i < characters.size(); i++) {
//            System.out.println(characters.get(i));
//        }
//        for(String character : characters){
//            System.out.println(character);
//        }

//        2. Declare a list containing 5 numbers, and another list containing another 5.
//        All the elements in the second list should be added in the first.
//        Using a foreach loop, print the first list.

//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(2);
//        list1.add(3);
//        list1.add(4);
//        list1.add(5);
//        list1.add(6);
//
//        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(7,8,9,10,11));
//
//        for(int number : list2){
//            list1.add(number);
//        }
//
//        for(int number : list1){
//            System.out.println(number);
//        }

//        3. Declare a list of characters containing the following values * g - 3 . q / ^ p
//        Print the number of elements in that list using a specific method provided by the class ArrayList.

//        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('*', 'g', '-', '3'));
//
//        chars.add('.');
//        chars.add('q');
//        chars.add('/');
//        chars.add('^');
//        chars.add('p');
//
//        System.out.println("The list has size " + chars.size());


//        4. The user will insert random words in a list up until the next "enough" will be provided.
//        After that, all the previously given words will be printed on the same row descending,
//        separated by whitespace.

//        ArrayList<String> list = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        while(true){
//            System.out.println("What word do you want to add to the list?");
//            String word = sc.nextLine();
//            if(word.equals("enough")){
//                break;
//            }else{
//                list.add(word);
//            }
//        }
//
//        for(int i = list.size()-1; i>=0; i--){
//
//            System.out.println(list.get(i) + " ");
//        }

//        5. Declare an arraylist of type integer in which 200 random generate numbers will be inserted
//        (those numbers should be between 0 and 100).
//        Print the sum off all the even generated numbers.

        ArrayList<Integer> numbers = new ArrayList<>();
        Random generator = new Random();
        for(int i =0; i<200; i++){
            numbers.add(generator.nextInt(200) + 1);
        }

        int sum = 0;
        for(int number : numbers){
            if(number%2 ==0){
                sum+=number;
            }
        }

        System.out.println("The sum of all the even generated numbers is equal to " + sum);

    }
}

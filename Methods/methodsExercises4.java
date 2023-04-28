import java.util.ArrayList;
import java.util.Arrays;

public class methodsExercises4 {
    public static void main(String[] args) {

//        System.out.println(fizzBuzz(45));
//        System.out.println(fizzBuzz(50));
//        System.out.println(fizzBuzz(9));
//        System.out.println(fizzBuzz(8));

//        printInReverse("software");
//        printInReverse("Java");
//        printInReverse("Software testing courses");

//        System.out.println(isPalindrome("abcdcba"));
//        System.out.println(isPalindrome("abcdcxa"));
//        System.out.println(isPalindrome("civic"));
//        System.out.println(isPalindrome("radar"));

        ArrayList<Integer> randomList = new ArrayList<>(Arrays.asList(2, 4, 3, 5, 2, 7, 345, 2, 467, 9, 2, 345, 5, 342));
        printCharactersCount(randomList, 5);


    }

//    1. Write a method that returns the text FIZZ if a number is passed as a parameter is divisible by 3.
//    "BUZZ" if that number is divisible by 5.
//    and "FIZZBUZZ" if that number is divisible by both 3 and 5.
//    If none of those case applies, the passed parameter will be returned in a String format.

    public static String fizzBuzz(int number){
        if (number % 15 == 0){
            return "FUZZBUZZ";
        }else if (number % 3 == 0){
            return "FIZZ";
        }else if (number % 5 == 0){
            return "BUZZ";
        }else{
            return " " + number;
        }
    }

//    2. Write a method that prints a String passed as a parameter in reverse:
//    For example, if I pass the value "software", the text "erawtfos" should be printed.

    public static void printInReverse(String word){
        char[] letters = word.toCharArray();
        for (int i = letters.length-1; i >= 0; i--){
            System.out.print(letters[i] + " ");
        }
        System.out.println();
    }

//    3. Write a method which determines if a given parameter of type String is a palindrome.
//    A text is a palindrome if he writeen in the mirror (exp: abcdcba, AndnA, civic, radar)

    public static boolean isPalindrome(String word){
        char[] letters = word.toCharArray();
        for(int i = 0; i< letters.length/2; i++){
            if(letters[i] != letters[letters.length-1-i]){
                return false;
            }
        }
        return true;
    }

//    4. Write a method that takes 2 parameters. An Arraylist of type Integer and an integer number.
//    The method will print how many times that integer number is found in the list.

    public static void printCharactersCount(ArrayList<Integer> list, int number ){
        int count = 0;
        for(int n : list){
            if(n == number){
                count++;
            }
        }

        System.out.println("The number " + number + " was found in the list " + count + " times");
    }

}

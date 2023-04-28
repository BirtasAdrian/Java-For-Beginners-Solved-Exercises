import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class methodsExercises2 {
    public static void main(String[] args) {

//        calculateAverage(5.5, 6.5, 77.7, 345.5, 6.5);
//        calculateAverage(66.5, 1.5, 89.5, 36.5, 9.5);

//        int result1 = add(10, 20, 30);
//        System.out.println(result1);
//        int result2 = add(55, 8, 11);
//        System.out.println(add(55, 8, 11));
//        int result3 = add(9, 15, 22);
//        System.out.println(add(9, 15, 22));

//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 6 , 88, 8, 5, 1));
//        int smallestNumber = returnTheSmallestNumber(numbers);
//        System.out.println("The smallest number in the list is " + smallestNumber);

//        ArrayList<String> result = returnList("I", "can", "pass", "five", "strings");
//        Collections.sort(result);
//        for (String text : result){
//            System.out.print(text + " ");
//    }
        convertToCelsius(0);
        convertToCelsius(100);


        }


//    1. Write a method called calculateAverage() which takes 5 parameters of type double and prints the text
//    "The average of *num1*, *num2*, *num3*, *num4* and *num5* is equal to *average*".
//    Call that method 2 times.

    public static void calculateAverage(double num1, double num2, double num3, double num4, double num5){
        double average = (num1 + num2 + num3 + num4 + num5)/5;
        System.out.printf("The average of %f, %f, %f, %f, %f is equal to %f\n", num1, num2, num3, num4, num5, average);
    }

//    2. Write a method called add() which takes 3 parameters of type int and returns their sum.
//    Call that method 3 times.

    public static int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

//    3. Write a method that returns the smallest number of a given parameter of type ArrayList<Integer>.

    public static int returnTheSmallestNumber(ArrayList<Integer> list){
        int smallest = Integer.MAX_VALUE;

        for(int number: list){
            if (number<smallest){
                smallest=number;
            }
        }
        return smallest;
    }

//    4. Write a method called returnList(), which takes 5 parameters of type String and returns a list
//    containing all the given values.
//    Call that method one time, sort the returned list and then print all the numbers.

    public static ArrayList<String> returnList(String s1, String s2, String s3, String s4, String s5){
        return new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));
    }

//    5. Write a method called convertToCelsius() which takes a parameter of type int fahrenheitDegrees.
//    The method must print the following text: "The given temperature is equivalent to *x* Celsius degrees".
//    T (C) = (T (F) -32) * 5/9

    public static void convertToCelsius(int fahrenheitDegrees){
    double celsiusDegrees = (fahrenheitDegrees - 32) * (5.0/9.0);
        System.out.println("The given temperature is equivalent to " + celsiusDegrees + " Celsius degrees");
}

}
import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises2 {
    public static void main(String[] args) {

//        1. Declare an array of type int that contains 10 numbers. The fallowing values should be printed:
//        A) the sum of all the even numbers
//        B) the average of all the positive values

//        int[] numbers = {34, 65, -342, 5, -76, 34, 12, 34, 4, -11 };
//        int evenNumbersSum = 0;
//        int positiveNumbersSum = 0;
//        int positiveNumbersCount = 0;
//        for (int number : numbers){
//            if(number%2 == 0){
//                evenNumbersSum+=number;
//            }
//            if (number >= 0){
//                positiveNumbersSum+= number;
//                positiveNumbersCount++;
//            }
//        }
//        System.out.println("The sum of all even numbers is equal to " + evenNumbersSum);
//        System.out.println("The average of all the positive numbers is equal to " + (positiveNumbersSum/positiveNumbersCount));

//        2. Declare an array of cars, with 6 empty slots. Fill the array using the index.
//        Sort the array, and after that, print the last 2 elements.

        String[] cars = new String[6];
        cars[0] = "Audi";
        cars[1] = "Smart";
        cars[2] = "Bmw";
        cars[3] = "Peugeot";
        cars[4] = "Dacia";
        cars[5] = "Mercedes";

        Arrays.sort(cars);
        System.out.println(cars[cars.length-1]);
        System.out.println(cars[cars.length-2]);

//        3. The user must provide a number x. Declare an array of double filled with x numbers.
//        Sort the array using one of the methods provided by the Array class.
//        Declare a second array named copy.
//        All the sorted numbers from the initial array should be moved in the second array.
//        Print the second array.

//        Scanner sc = new Scanner(System.in);
//        double randomNumber = 20.4;
//        System.out.println("Enter the size of your array:");
//        int size = sc.nextInt();
//        double[] doubleNumbers = new double[size];
//        for (int i = 0; i<size; i++){
//            doubleNumbers[i] = randomNumber;
//            randomNumber+=28;
//        }
//        Arrays.sort(doubleNumbers);
//        double[] copy = new double[size];
//        for(int i = 0; i <size; i++){
//            copy[i] = doubleNumbers[i];
//        }
//        for (double number : copy){
//            System.out.println(number);
//        }

//        4. Paste all the values from exercise 2 in a new array named numberCopy using the for loop.
//        Print all the values in the console.

//        String[] carsCopy = new String[cars.length];
//        for(int i = 0; i < cars.length; i++){
//            carsCopy[i] = cars[i];
//        }
//        System.out.println(Arrays.toString(carsCopy));

//        5. Paste all the values from exercise 2 in a new array named numberCopy using the while loop.
//        Print all the values in the console.

//        String[] carsCopy = new String[cars.length];
//        int index = 0;
//        while(index< cars.length){
//            carsCopy[index] = cars[index];
//            index++;
//        }
//        System.out.println(Arrays.toString(carsCopy));

//        6. Print the average of all the odd numbers of an array of size type double containing 12 values.

        double[] doubleNumbers = {34.6, 23.5, 765.6, 78.7, 11.2, 23.4, 54.6, 76.4, 34.01, -234.2, 12.3};
        double sum = 0;
        int oddNumbersCount = 0;
        for(double number : doubleNumbers){
            if(number%2 != 0){
                sum+=number;
                oddNumbersCount++;
            }
        }
        System.out.println("The sum of all the odd numbers is equal to " + (sum/oddNumbersCount));
    }
}

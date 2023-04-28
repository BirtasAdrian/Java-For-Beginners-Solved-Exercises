import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Long.divideUnsigned;
import static java.lang.Long.sum;

public class methodsExercises3 {

    public static void main(String[] args) {

//        guessTheNumber(55);

//        boolean firstCase = isLeapYear(2016);
//        boolean secondCase = isLeapYear(2019);
//        System.out.println(firstCase);
//        System.out.println(secondCase);

//        Scanner sc = new Scanner(System.in);
//        Scanner scOperation = new Scanner(System.in);
//        System.out.println("Enter the first number:");
//        int firstNumber = sc.nextInt();
//        System.out.println("Enter the second number:");
//        int secondNumber = sc.nextInt();
//        System.out.println("What is the operation ( + - * / % ^)");
//        char operation = scOperation.next().charAt(0);
//
//        switch (operation) {
//            case '+':
//                System.out.println(sum(firstNumber, secondNumber));
//                break;
//
//            case '-':
//                System.out.println(difference(firstNumber, secondNumber));
//                break;
//
//            case '*':
//                System.out.println(multiply(firstNumber, secondNumber));
//                break;
//
//            case '/':
//                System.out.println(divide(firstNumber, secondNumber));
//                break;
//
//            case '%':
//                System.out.println(modulo(firstNumber, secondNumber));
//                break;
//
//            case '^':
//                System.out.println(power(firstNumber, secondNumber));
//                break;
//            default:
//                System.out.println("That is not a valid operation");
//        }

//        System.out.println(factorial(5));
//        System.out.println(factorial(6));
//        System.out.println(factorial(7));
//        System.out.println(factorial(8));

        ArrayList<Integer> firstList = new ArrayList<>(Arrays.asList(6, 7, 8 ,9, 10, 11, 12));
        ArrayList<Integer> secondList = new ArrayList<>(Arrays.asList(4, 5, 3, 2, -44));

        boolean firstListIsBigger = isFirstListBigger(firstList, secondList);
        System.out.println(firstListIsBigger);

    }

//    1. Declare a method called guessTheNumber(), which takes a parameter of type int hiddenNumber and prints
//    "You guessed!" if a user provides in the console that number.
//    That method should also print "Try a greater number" or "Try a smaller number",
//    based on the number the user provides in the console.
//    The user must provide numbers until he guesses the hidden on.

    public static void guessTheNumber(int hiddenNumber){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Try to guess the number");
            int guess = sc.nextInt();
            if(guess < hiddenNumber){
                System.out.println("Try a bigger number");
            }else if(guess > hiddenNumber){
                System.out.println("Try a smaller number");
            }else{
                System.out.println("You guessed");
                break;
            }
        }
    }

//    2. Declare a method which takes a parameter of type int and return a Boolean.
//    This method calculates and returns if that provided number is a leap year.

    public static boolean isLeapYear(int year){
         return year%400 ==0 || (year%4==0 && year%100 !=0);

    }

//    3. Declare 6 methods : sum, difference, multiply, divide, module, power.
//    All those methods must take 2 parameters of type int and prints the result.
//    In the main method, the user will provide two numbers, and one of the following characters : + - * / % ^
//    Based on the given character, the specific method will be called using the 2 entered numbers.
//    Test each case.

    public static int sum(int x1, int x2) {
        return x1 + x2;
    }

    public static int difference(int x1, int x2) {
        return x1 - x2;
    }

        public static int multiply ( int x1, int x2) {
            return x1 * x2;
        }

        public static int divide(int x1, int x2) {
            return x1 / x2;
        }

        public static int modulo(int x1, int x2) {
            return x1 % x2;
        }

            public static double power(int x1, int x2){
                return Math.pow(x1, x2);
            }


//    4. Write a method that takes in a parameter of type int x, and returns the factorial of that number.
//    (5 factorial = 1 * 2 * 3 * 4 * 5)

    public static int factorial(int x){
        int result = 1;
        for(int i =2;  i <= x; i++){
            result*=i;
        }
        return result;
    }

//    5. Write a method that takes 2 lists as parameters and returns true if all the elements of the first list are greater
//    or equal than all the elements of the second list.

    public static boolean isFirstListBigger(ArrayList<Integer> list1, ArrayList<Integer> list2){
        boolean firstElementAreBigger = true;
        for(int number : list1){
            for(int number2 : list2){
                if (number2 > number) {
                    firstElementAreBigger = false;
                    break;
                }
            }
        }
        return firstElementAreBigger;
    }


}

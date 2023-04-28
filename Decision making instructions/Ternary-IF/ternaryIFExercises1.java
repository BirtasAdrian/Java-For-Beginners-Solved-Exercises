import java.util.Scanner;

public class ternaryIFExercises1 {
    public static void main(String[] args) {

//        1. Write a program that asks the user for a number.
//        If the number is positive, print a specific message. Do so if the number is negative.
//        The program should only consist in 4 lines of code.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number:");
//        int number = sc.nextInt();
//        System.out.println(number >=0 ? "The number is positive" : "The number is negative");

//        2. Declare a variable of type boolean named iAmThirsty and initialize it by entering
//        its value from the console.
//        One of the following message will be printed after that:
//        "Drink some water" or "Don't drink anymore".
//        User ternary if.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Are you thirsty? Type true/false");
//        boolean iAmThirsty = sc.nextBoolean();
//        System.out.println(iAmThirsty ? "Drink some water" : "Don't drink anymore");

//        3. Declare 2 variables of type int and initialize them by entering their values
//        in the console.
//        If the first number is grater, print the text  "The first number is grater"
//        If not, print the text "The first number is not greater"
//        Use ternary if.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number:");
//        int number1 = sc.nextInt();
//        System.out.println("Enter the second number:");
//        int number2 = sc.nextInt();

//        We can use any of the fallowing to print the biggest number.

//        System.out.println(number1 > number2 ? "The first number is bigger" : "The first number is not bigger");

//        System.out.println("The first number is " + (number1 > number2 ? "" : "not ") + "bigger");

//        4. Declare two variables of type int and initialize them.
//        The user will provide a third value in the console.
//        If that number is bigger than both our previous variables,
//        a specific message will be printed. So if it's not.
//        User ternary if.

//        int number1 = 100;
//        int number2 = 300;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number:");
//        int myNumber =sc.nextInt();

//        We can use any of the fallowing to print the specific message.

//        System.out.println((myNumber > number1 && myNumber > number2) ? "Your number is bigger" : "Your number is not bigger");

//        System.out.println("Your number is " + (myNumber > number1 && myNumber > number2 ? "" : "not ") + "bigger");

//        5. Write a program that asks the user to provide his or her annual grade.
//        If the grade is grater than or equal to 5, the message "You graduated" will be printed.
//        If not, the program will print "You failed"

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your annual grade:");
        double grade = sc.nextDouble();
        System.out.println(grade >=5 ? "You graduated" : "You failed!");

    }
}

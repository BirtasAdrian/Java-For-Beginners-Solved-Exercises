import java.time.temporal.IsoFields;
import java.util.Scanner;

public class UserInputScannerExercises {

    public static void main(String[] args) {

//        1. Print the following text "What profession do you want to have the next year?"
//        The user must enter the response in console.
//        The text "Keep up the good work and next year you will be a *response*
//        will be printed in the console,"

//        Scanner sc = new Scanner(System.in);
//        System.out.println("What profession do you want to have the next year?");
//        String desiredProfession = sc.nextLine();
//        System.out.println("Keep up the good work and next year you will be a " + desiredProfession);

//        2. Write the program that prints the following text
//        "Welcome to the system. How old are you?"
//        The user will enter the response in the console, and it will be stored in a variable.
//        The text "Oh I see. You're *response* years old will be printed in the console.

//        Scanner reader = new Scanner(System.in);
//        System.out.println("Welcome to the system. How old are you?");
//        int age = reader.nextInt();
//        System.out.println("Oh I see. You're " + age + " years old");
//        System.out.printf("Oh I see. You're %d years old", age);

//        3. Write a program that asks the user his or her sex, by specifying only the values.
//        M or F should be entered in the console.
//        Store the users response in a specific variable
//        and print the text "You picked *response*"
//
//          Scanner reader = new Scanner(System.in);
//          System.out.println("Please enter your sex (M or F) :");
//          char gender  = reader.next().charAt(0);
//          System.out.println("You picked " + gender);
//          System.out.printf("You picked %c", gender);

//        4. The user must enter 3 numbers. Save the specific numbers in 3 variables.
//        Print their sum, difference, multiplication, division and average on different rows.
//        The format should be "The x is equal to y",
//        where x represents the sum, dif, multiplication, division and average,
//        and y represents the result.

//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        int n1 = reader.nextInt();
//        System.out.println("Enter the second number: ");
//        int n2 = reader.nextInt();
//        System.out.println("Enter the third number: ");
//        int n3 = reader.nextInt();
//
//        int sum = n1 + n2 + n3;
//        int diff = n1 - n2 - n3;
//        int product = n1 * n2 * n3;
//        double average = sum / 3;

//        System.out.printf("The sum is equal to %d \n The difference is equal to %d \n" +
//                "The product is equal to %d \n The average is equal to %f", sum , diff, product, average);



//        5. Write a program that ask the user to enter the current temperature in Celsius degrees,
//        and prints the results in Fahrenheit degrees. (Search for the formula on Google)

         Scanner reader  = new Scanner(System.in);
         System.out.println("Enter the temperature in Celsius degrees: ");
         int celsiusDegrees = reader.nextInt();
         double faranheitDegrees = celsiusDegrees * (9.0/5.0) + 32;
         System.out.println("The result in Faranheit Degrees is equal to " + faranheitDegrees);
    }
}

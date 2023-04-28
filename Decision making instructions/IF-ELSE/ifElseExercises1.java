import java.util.Scanner;

public class ifElseExercises1 {
    public static void main(String[] args) {

//        1. Write a program that asks the user to enter 2 numbers and prints if they are equal or not.

//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter the first number:");
//        int number1 = reader.nextInt();
//        System.out.println("Enter the second number:");
//        int number2 = reader.nextInt();
//        if(number1 == number2){
//            System.out.println("The numbers are equal");
//        }else {
//            System.out.println("The numbers are not equal");
//        }

//        2. Write a program that asks the user for a number and prints if the number is even or odd.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int number = sc.nextInt();
//        if(number %2 == 0){
//            System.out.println("The number is event");
//        }else{
//            System.out.println("The number is odd");
//        }

//        3. Write a program that asks the user for a number and prints if the number is less or greater than zero.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please provide a number:");
//        int number = sc.nextInt();
//        if(number > 0){
//            System.out.println("The number is positive");
//        }else{
//            System.out.println("The number is negative");
//        }

//        4. Write a program that asks the user for 3 numbers and prints which number is the smallest.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter the first number:");
//        int firstN = sc.nextInt();
//        System.out.println("Please enter the second number:");
//        int secondN = sc.nextInt();
//        System.out.println("Please enter the third number:");
//        int thirdN = sc.nextInt();
//
//        int smallest = firstN;
//        if(secondN< smallest){
//            smallest = secondN;
//        }else if(thirdN < smallest){
//            smallest = thirdN;
//        }
//            System.out.println("The smallest provided number is " + smallest);

//        5. Write a program that asks the user to enter his or her age, and the age he or she wants to retire.
//        The program will either print "You still got x more years to work" or "You already retired x years ago"
//        Also, the age the user entered must be valid. A valid age is between 18 and 99.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = sc.nextInt();
        System.out.println("What age do you want to retire?");
        int retireAge = sc.nextInt();
        if (age <= 0 || retireAge <= 0){
            System.out.println("You have entered a negative age.");
        }else if (age >= 100 || retireAge >=100){
            System.out.println("You cannot enter an age above 100");
        }else{
            if (age < retireAge){
                System.out.println("You still have to work " + (retireAge-age) + " years");
            }else{
                System.out.println("You already retired " + (age-retireAge) + " years ago");
            }
        }

    }
}

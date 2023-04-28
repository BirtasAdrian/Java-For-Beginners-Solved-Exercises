import java.util.Scanner;

public class ifElseExercises2 {
    public static void main(String[] args) {



//    1. Write a program that asks the user for his or her age. If the user is below 18, print the text "You are a major"
//    If the user is under 18, the text "You're still a minor" will be printed.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please insert your age");
//        int age = sc.nextInt();
//        if (age>= 18){
//            System.out.println("You're an adult");
//        }else{
//            System.out.println("You're still a minor");
//        }

//    2. Write a program that determines if the sum of two numbers is equal of greater than 100
//    and prints one of the following messages: "The sum is equal or greater than 100."
//    Or "The sum is less than 100."

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number:");
//        int number1 = sc.nextInt();
//        System.out.println("Enter the second number");
//        int number2 = sc.nextInt();
//        int sum = number1 + number2;
//        if (sum>=100){
//            System.out.println("The sum is greater or equal to 100");
//        }else{
//            System.out.println("The sum is less than 100");
//        }

//    3. Write a program that asks the user for the traffic light color.
//    If the color is green, the text "Please cross the street" will be printed.
//    If the color is yellow, the text "Let's be safe. You should wait" will be printed.
//    If the color is red, the next "You can't cross the street. Please wait." will be printed.
//    Also, see what happens if the user enters any other color.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the color of the traffic light:");
//        String color = sc.nextLine();
//        if(color.equalsIgnoreCase("red")){
//            System.out.println("You can't cross the street");
//        }else if(color.equalsIgnoreCase("yellow")){
//            System.out.println("You should be careful");
//        }else if(color.equalsIgnoreCase("green")){
//            System.out.println("You can cross the street");
//        }else{
//            System.out.println("You did not enter a valid traffic light");
//        }

//    4. Write a program that aks the user for the current hour and print how many hours are left until
//    midnight. This time, if the user enters a number less than 0 or greater than 24,
//    we should be able to treat that case.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter the current hour:");
//        int hour = sc.nextInt();
//        if (hour < 0 || hour > 24){
//            System.out.println("You did not enter a valid time");
//        }else{
//            System.out.println("There are " + (24- hour) + " hours left until midnight");
//        }

//    5. Declare a variable of type Boolean named iHaveEnergy. The program should ask the user if he or she
//    has any energy left. If so, the program will suggest you to go out for a run.
//    If not, to drink a coffee or go to sleep.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Do you have energy?");
//        boolean iHaveEnergy = sc.nextBoolean();
//        if (iHaveEnergy){
//            System.out.println("Go for a run");
//        }else{
//            System.out.println("You should drink a coffee");
//        }

//    6. Write a program that asks the user to enter a number between 1 and 100.
//    If the number is less than 50, the application will print that number multiplied by 5.
//    If the number is equal or greater than 50, the application will print the number multiplied by 2.
//    The program should also print if the entered number id odd or even.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 100:");
        int number = sc.nextInt();
        if (number <=0 || number >100){
            System.out.println("You did not enter a number between 0 and 100");
        }else{
            if (number<50){
                System.out.println("The number multiplied by 5 is equal to " + (number*5));
            }else{
                System.out.println("The number multiplied by 2 is equal to " + (number*2));
            }
            if (number%2 == 0){
                System.out.println("The number is even");
            }else{
                System.out.println("The number is odd");
            }
        }
}
}



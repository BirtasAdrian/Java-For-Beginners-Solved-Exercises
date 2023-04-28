import java.util.Scanner;

public class ternaryIFExercises2 {
    public static void main(String[] args) {

//        1. Declare 2 variables of type double and initialize them by reading 2 values from the console.
//        If their sum is grater than 100, print a specific message. Do so if it's not.
//        User ternary if.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number");
//        double number1 = sc.nextDouble();
//        System.out.println("Enter the second number");
//        double number2 =sc.nextDouble();
//        System.out.println(number1 + number2 > 100 ?
//                "The sum of the numbers is greater than 100" : "The sum is not greater than 100");

//        2. Write a program that asks the user to provide 3 numbers. If their average is greater than 50,
//        print a specific message. Do so if it's not.
//        Use ternary if.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please insert the first number:");
//        int number1 =sc.nextInt();
//        System.out.println("Please insert the second number:");
//        int number2 = sc.nextInt();
//        System.out.println("Please insert the third number:");
//        int number3 = sc.nextInt();
//        int average = (number1 + number2 + number3) / 3;
//        System.out.println("The average is " + (average > 50 ? "" : "NOT") + " greater than 50");

//        3. Write a program that asks the user to provide the number of hours he worked this day.
//        If he or she worked minimum 8 hours, the text  "See you tomorrow" will be printed.
//        If not, the program will print "You still got work to do".

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of hours you worked today:");
//        int hours = sc.nextInt();
//        System.out.println(hours >= 8 ? "See you tomorrow" : "You still got work to do");

//        4. Declare a variable of type Boolean named iHaveEnergy and initialize it by providing
//        a value from the console.
//        The program will ask the user to provide the current month.
//        For each possible season (spring/summer/autumn/winter), if the user has energy.
//        a specific activity will be printed. If not, the message "You should get some rest"
//        will be printed. Use a ternary if inside each season case.

//        Scanner sc = new Scanner(System.in);
//        Scanner scText = new Scanner(System.in);
//        System.out.println("Do you have energy?");
//        boolean iHaveEnergy = sc.nextBoolean();
//        System.out.println("Enter the current month:");
//        String month = scText.nextLine();
//        switch (month){
//            case "december":
//            case "january":
//            case "february":
////                winter logic
//                System.out.println(iHaveEnergy ? "We'll have a snow fight" : "You should get some rest");
//                break;
//            case "march":
//            case "april":
//            case "may":
////                spring logic
//                System.out.println(iHaveEnergy ? "Let's go to the park" : "You should get some rest");
//                break;
//            case "june":
//            case "july":
//            case "august":
////                summer logic
//                System.out.println(iHaveEnergy ? "Let's go to the pool" : "You should get some rest");
//                break;
//            case "september":
//            case "october":
//            case "november":
////                autumn logic
//                System.out.println(iHaveEnergy ? "Let's go to the cinema" : "You should get some rest");
//                break;
//            default:
//                System.out.println("You did not enter a valid month");

//
//        }

//        5. A given shop has the following 4 products: ps5(1000$), xbox(500$), pc(2000$) and
//        laptop(1500$).
//        The user has a budget of 1700$.
//        The program will ask the user which product he or she wants to buy.
//        If the user has enough money, he will successfully buy the specified product.
//        If not, a specific message will be displayed.

        int ps5Price = 1000;
        int xboxPrice = 500;
        int pcPrice = 2000;
        int laptopPrice = 1500;
        int budget = 1700;
        Scanner sc = new Scanner(System.in);
        System.out.println("What product do you want to buy ?");
        String answer = sc.nextLine();
        switch (answer){
            case "ps5":
                System.out.println(budget >= ps5Price ? "You just bought a ps5" : "You can't afford a ps5");
                break;
            case "xbox":
                System.out.println(budget >= xboxPrice ? "You just bought a xbox" : "You can't afford a xbox");
                break;
            case "pc":
                System.out.println(budget >= pcPrice ? "You just bought a pc" : "You can't afford a pc");
                break;
            case "laptop":
                System.out.println(budget >= laptopPrice ? "You just bought a laptop" : "You can't afford a laptop");
                break;
        }


    }
}

import java.util.Scanner;

public class WhileLoopExercises1 {
    public static void main(String[] args) {

//        1. Write a program that prints the text "I will become a software tester"
//        10 times using the while loop.

//        int counter = 0;
//        while(counter < 10){
//            System.out.println("I will become a software tester");
//            counter++;
//        }

//        2. Write a program that prints the sum of the first 20 natural numbers
//        using the while loop.

//        int counter = 1;
//        int sum = 0;
//        while(counter<=20){
//            sum+=counter;
//            counter++;
//        }
//        System.out.println("The sum of the first 20 natural numbers is equal to " + sum);

//        3. Write a program that asks the user to provide 4 numbers using while,
//        and then prints their product. Use while.

//        Scanner sc = new Scanner(System.in);
//        int counter = 1;
//        int product = 1;
//        while(counter<=4){
//            System.out.println("Enter a number");
//            int number = sc.nextInt();
//            product *= number;
//            counter++;
//        }
//        System.out.println("The product is equal to " + product);

//        4. Write a program that asks the user to provide a number n and then prints the text
//        "I know how to use while loop" n times.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of repetitions");
//        int repetitions = sc.nextInt();
//        while (repetitions > 0) {
//            System.out.println("I know how to use the while loop");
//            repetitions--;
//        }

//        5. Write a program that repeatedly asks the user to provide a number.
//        When the user provides a number that is divisible by 15, the sum of all the previous
//        provided numbers will be printed and the application will shut down.

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Enter a number");
            int number = sc.nextInt();
            if (number%15==0){
                break;
            }else{
                sum += number;
            }
        }
        System.out.println("The sum of all the previous numbers is equal to " + sum);


    }
}

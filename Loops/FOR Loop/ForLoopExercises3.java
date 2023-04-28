import java.util.Scanner;

public class ForLoopExercises3 {
    public static void main(String[] args) {

//        1. Write a program that calculates the sum of all the numbers between 1 and 50.

//        int sum = 0;
//        for (int i = 1;  i<=50;  i++){
//            sum+=i;
//        }
//        System.out.println("The sum of all the numbers between 1 and 50 is equal to " + sum);
//
//        2. Write a program that calculates the sum of all the odd numbers between 5 and 100.

//        int sum = 0;
//        for (int i = 1; i <= 100; i++){
//            if(i%2 !=0){
//                sum +=i;
//            }
//        }
//            System.out.println("The sum of all the odd numbers between 1 and 100 is equal to " + sum);

//        Another method

//        int sum = 0;
//        for (int i = 1; i <= 100; i += 2) {
//            sum += i;
//        }
//        System.out.println("The sum of all the odd numbers between 1 and 100 is equal to " + sum);

//        3. Write a program that calculates and prints the average of all the numbers
//        between 10 and 100.

//        int sum = 0;
//        int numberCount = 0;
//        for (int i = 10; i <= 100; i++) {
//            sum += i;
//            numberCount += 1;
//        }
//        double average = sum/numberCount;
//        System.out.println("The average of all the numbers between 10 and 100 is equal to " + average);

//        4. Write a program that calculates and prints the sum and the product of all the numbers
//        between -5 and 5.

//        int sum =0;
//        int product =1;
//        for (int i =-5; i <=5; i++){
//            sum+=i;
//            product*=i;
//        }
//        System.out.println("The sum is equal to " + sum);
//        System.out.println("The product is equal to " + product);

//        5. The program will ask the user to provide a number in the console.
//        If the number is positive, calculate and print the multiplication off all the even numbers.
//        between 1 and that number
//        If the number is negative. calculate and print the sum of all the odd numbers starting
//        from that number up until 0.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = sc.nextInt();
        if (number > 0) {
            int product = 1;
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    product *= i;
                }
            }
            System.out.println("The product of all the even numbers between 1 and " + number + " is equal to " + product);
        } else {
            int sum = 0;
            for (int i = 0; i >= number; i--) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
            System.out.println("The sum of all the odd numbers between 0 and "
                    + number + " is equal to" + sum);
        }
    }
}

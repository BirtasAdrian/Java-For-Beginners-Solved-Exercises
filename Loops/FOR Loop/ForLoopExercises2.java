import java.util.Scanner;

public class ForLoopExercises2 {
    public static void main(String[] args) {

//        1. Write a program that asks the user for a number.
//        If that number is even, it will be printed ten times.
//        If it's odd, it will be printed 28 times.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int number = sc.nextInt();
//        if(number%2 == 0){
//            for(int i = 1; i <= 10; i++){
//                System.out.println(number);
//            }
//        }else {
//            for (int i = 1; i <= 20; i++) {
//                System.out.println(number);
//            }
//        }

//        2. Write a program that asks the user to provide a String text and an int x.
//        The text will be printed x times.

//        Scanner scannerText = new Scanner(System.in);
//        Scanner scannerInt = new Scanner(System.in);
//        System.out.println("Enter your text:");
//        String text = scannerText.nextLine();
//        System.out.println("How many times do you want your text to be printed?");
//        int counter = scannerInt.nextInt();
//        for( int i = 0; i < counter; i++ ){
//            System.out.println(text + " x" + (i+1));
//        }


//        3. Write a program that asks the user to provide a text and a number.
//        If that number is less than 5, the text will be printed 10 times on different rows.
//        If that number is equal or greater than 5, the text will be printed 10 times on the same row,
//        with a whitespace in between.

//        Scanner scText = new Scanner(System.in);
//        Scanner scInt = new Scanner(System.in);
//        System.out.println("Enter your text:");
//        String text = scText.nextLine();
//        System.out.println("Enter a number");
//        int number = scInt.nextInt();
//        for (int i = 0; i < 10; i++) {
//            if (number < 5) {
//                System.out.println(text);
//            } else {
//                System.out.print(text + " ");
//            }
//        }

//        4.Write a program that asks the user for the current hour.
//        The application will print the clock 15 minutes by 15 minutes.
//        starting from 00.00 up until that hour.
//        The text should look like this 0:00 0:15 0:30 0:45 1:00 1:15 1:30 and so on

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the time:");
//        int hour = sc.nextInt();
//        for (int i = 0; i < hour; i++){
//            System.out.println(i + ":00");
//            System.out.println(i + ":15");
//            System.out.println(i + ":30");
//            System.out.println(i + ":45");
//        }
//        System.out.println(hour + ":00");

//        5. Write a program that asks the user to provide a number x.
//        After that, the user will have to provide x numbers in the console.
//        The application will print the smallest number provided by the user bellow.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of readings:");
        int readCount = sc.nextInt();
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < readCount; i++) {
            System.out.println("Please insert number " + (i + 1) + ":");
            int number = sc.nextInt();
            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("The smallest entered number was " + smallest);
    }
}

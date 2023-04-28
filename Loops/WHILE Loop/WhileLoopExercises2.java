import java.util.Random;
import java.util.Scanner;

public class WhileLoopExercises2 {
    public static void main(String[] args) {

//        1. Write a program that repeatedly asks the user to provide numbers in the console.
//        When the user provides the number 0, the program will print the average of all the
//        previously given numbers and the application will shut down.

//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        int numberCount = 0;
//        while(true){
//            System.out.println("Enter a number");
//            int number = sc.nextInt();
//            if (number == 0){
//                break;
//            }else{
//                sum+= number;
//                numberCount++;
//            }
//        }
////        Here we make a cast with double, because integer/integer is equal with an integer, and we don't want that.
//
//        double average = (double) sum/numberCount;
//        System.out.println("The average of all the numbers is equal to " + average);

//        2. Declare a variable named hiddenNumber of type int and initialize it.
//        The program will repeatedly ask the user to guess that number.
//        If the user provides a smaller number, the program will print "Try a bigger number"
//        If the user provides a greater number, the program will print "Try a smaller number"
//        If the user guesses the hidden number, the program will print "Congrats! You guessed
//        the number in *X* attempts.


//        Scanner sc = new Scanner(System.in);
//        Random generator = new Random();
////        This will generate a random number between 0 and 99
//        int hiddenNumber = generator.nextInt( 100);
//        int attemptsCount = 0;
//        while(true){
//            System.out.println("Enter a number:");
//            int number = sc.nextInt();
//            attemptsCount++;
//            if (number<hiddenNumber){
//                System.out.println("Try a bigger number");
//            }else if (number>hiddenNumber){
//                System.out.println("Try a smaller number");
//            }else{
//                System.out.println("Congrats. You guessed the number in " + attemptsCount + " attempts");
//                break;
//            }
//        }

//        3. The next program will calculate the total space occupied by the files on the hard drive.
//        First, the user must provide the number of files. After that, the user must provide
//        the size of all those files (in megabytes MB)
//        At last, the program will print the total size in megaBytes, depending on all the sizes entered

//        The application should look like this:
//        Please provide the number of files:
//        >3
//        Please provide the size of the file 1 (MB)
//        >500
//        Please provide the size of the file 2 (MB)
//        >600
//        Please provide the size of the file 3 (MB)
//        >6
//        The total space is 1109MB

//        Scanner sc = new Scanner(System.in);
//        int counter = 1;
//        int totalSize = 0;
//        System.out.println("Please provide the number of files");
//        int fileNumber = sc.nextInt();
//        while (fileNumber >0) {
//            System.out.println("Please provide the size of the file " + counter++ + ":");
//            int size = sc.nextInt();
//            totalSize += size;
//            fileNumber--;
//        }
//        System.out.println("The total size is " + totalSize + "MB");

        }
    }


import java.util.Scanner;

public class ifElseExercises3 {
    public static void main(String[] args) {

//        1. Write a program that declares a variable named hiddenNumber and initializes it with the value 999.
//        and then asks the user to guess the hidden number.
//        If her or she guesses, the text "You got it" will be printed.
//        If not, one of the two following texts will be printed "Wrong. Try a bigger number" or
//        "Wrong. Try a smaller number.

//        Scanner sc = new Scanner(System.in);
//        int hiddenNumber = 999;
//        System.out.println("Try to guess our number");
//        int guess = sc.nextInt();
//        if (hiddenNumber == guess){
//            System.out.println("You got it");
//        }else if(guess<hiddenNumber){
//            System.out.println("Wrong. Try a bigger number");
//        }else {
//            System.out.println("Wrong. Try a smaller number");
//        }

//        2. Write a program that asks the user for a year (exp 1856) and calculate if the specific year is a leap year
//        (Search the formula on Google).

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a year");
//        int year = sc.nextInt();
//        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
//            System.out.println("This is a leap year");
//        }else{
//            System.out.println("This is not a leap year");
//        }

//        3. Write a program that asks the user for his age, and then prints that age in dog years (x7).
//        If the result is greater than 100, the text "You've been around here a century" will be printed.
//        If not, the text "You're still a baby" will be printed.
//        If the user provides a negative number, the text "I see, so you will be born in x years" will be printed.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age");
//        int age = sc.nextInt();
//        if (age < 0){
//            System.out.println("I seem so you will be born in " + (-age) + " years.");
//        }else {
//            int dogYear = age * 7;
//            if (dogYear >=100){
//                System.out.println("You've been around here for a century");
//            }else {
//                System.out.println("You're still a baby");
//            }
//        }

//        4. Write a program that asks the user how many beers did he or she drank, and then provides some advice.
//        If the user drank less 4 beers, he or she should drink some more.
//        If the user drank more than 4 beers, he or she should go to sleep.
//        If the user didn't drink any beers, he must be driving.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("How many beers did you have?");
//        int beerCount = sc.nextInt();
//        if (beerCount<0){
//            System.out.println("You cannot enter a negative number");
//        }else{
//            if (beerCount == 0){
//                System.out.println("I see you must be driving");
//            }else if (beerCount <=4){
//                System.out.println("You should drink some more");
//            }else{
//                System.out.println("Your should go to sleep");
//            }
//        }

//        5. Write a program that determines a student grade.
//        The program will asks the user for 3 grades, and their average will be calculated
//        (each grade must be between 1 and 100).
//        If the average is below 90, the student got an A.
//        If the average is between 70 and 90, the student got a B.
//        If the average is between 50 and 70, the student got a C.
//        If the average is below 50, the student got an F

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first grade");
        int grade1 = sc.nextInt();
        System.out.println("Enter the second grade");
        int grade2 = sc.nextInt();
        System.out.println("Enter the third grade");
        int grade3 = sc.nextInt();
        if (grade1 < 0 || grade2 < 0 || grade3 < 0){
            System.out.println("You cannot enter a negative grade");
        }else if(grade1 >100 || grade2 >100 || grade3 >100){
            System.out.println("You cannot enter a grade bigger than 100");
        }else{
            double average = (grade1 + grade2 + grade3) / 3.0;
            if (average > 90){
                System.out.println("A");
            }else if (average > 70){
                System.out.println("B");
            }else if (average > 50){
                System.out.println("C");
            }else{
                System.out.println("F");
            }
        }
    }
}

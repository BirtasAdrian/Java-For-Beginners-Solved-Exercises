import java.util.Scanner;

public class switchExercises1 {
    public static void main(String[] args) {

//        1. The user must insert a number between 1 and 9
//        The program will print that values using words (exp: one, two... nine)

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a number between 1 and 9");
//        int number = sc.nextInt();
//        switch (number) {
//            case 1:
//                System.out.println("one");
//                break;
//            case 2:
//                System.out.println("two");
//                break;
//            case 3:
//                System.out.println("three");
//                break;
//            case 4:
//                System.out.println("four");
//                break;
//            case 5:
//                System.out.println("five");
//                break;
//            case 6:
//                System.out.println("six");
//                break;
//            case 7:
//                System.out.println("seven");
//                break;
//            case 8:
//                System.out.println("eight");
//                break;
//            case 9:
//                System.out.println("nine");
//                break;
//            default:
//                System.out.println("You did not enter a number between 1 and 9");
//        }

//        2. Write a program that asks the user for his or her math grade and prints
//        one of the following messages:
//        1-4 : You failed
//        5-6 : You still got work to do
//        7-9 : Congrats
//        10 : King
//        Use switch.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your math grade?");
//        int grade = sc.nextInt();
//        switch (grade){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//                System.out.println("You failed");
//                break;
//            case 5:
//            case 6:
//                System.out.println("You still got work to do");
//                break;
//            case 7:
//            case 8:
//            case 9:
//                System.out.println("Congrats!");
//                break;
//            case 10:
//                System.out.println("King");
//                break;
//            default :
//                System.out.println("The grade must be between 1 and 10");
//
//        }

//        3. Write a program that aks the user for the current week day and prints the specific message:
//        If it is a working day, the text "Work hard" will be printed.
//        If it is weekend, the text "Have fun or get some rest" will be printed.
//        Use switch.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the current day:");
//        String day = sc.nextLine();
//        switch (day){
//            case "monday":
//            case "tuesday":
//            case "wednesday":
//            case "thursday":
//            case "friday":
//                System.out.println("Work hard");
//                break;
//            case "saturday":
//            case "sunday":
//                System.out.println("Have fun or get some rest");
//                break;
//            default:
//                System.out.println("That is not a valid day of the week");
//        }

//        4. Write a program that asks the user how does he or she like this course.
//        If the user enters "very much" the computer will print "<3".
//        If the user enters "ok" the computer will print "I'm glad".
//        If the user enters "hard" the computer will print "You should redo the exercises".
//        If the user enters "I don't understand anything", the computer will print "Liar".

//        Scanner sc = new Scanner(System.in);
//        System.out.println("How do you like this course?");
//        String answer = sc.nextLine();
//        switch (answer){
//            case "very much":
//                System.out.println("<3");
//                break;
//            case "ok":
//                System.out.println("I'm glad");
//                break;
//            case "hard":
//                System.out.println("You should redo the exercises");
//                break;
//            case "I don't understand anything":
//                System.out.println("Liar");
//                break;
//            default:
//                System.out.println("This is not a valid answer");
//        }


//        5. Write a program that asks the user what is his or her favorite vacation type;
//        seaside, mountain or country.
//        For each case, the program will suggest some nice corresponding destinations.
//        Use switch.

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your favorite type of vacation?");
        String answer = sc.nextLine();
        switch (answer){
            case "seaside":
                System.out.println("Greece");
                break;
            case "mountain":
                System.out.println("The Alps");
                break;
            case "country":
                System.out.println("France");
                break;
            default:
                System.out.println("I don't understand that");
        }
    }
}

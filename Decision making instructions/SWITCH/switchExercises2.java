import java.util.Scanner;

public class switchExercises2 {
    public static void main(String[] args) {

//        1. Write a program that asks the user for the grade he is in. Depending on the answer, one of the following
//        messages will be printed:
//        1-4 Primary school
//        5-8 General school
//        9-12 high school
//        If the user enters a greater number, the text "You already graduated" will be printed.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("What grade are you in?");
//        int grade = sc.nextInt();
//        switch (grade){
//            case 1:
//            case 2:
//            case 3:
//                System.out.println("Primary school");
//                break;
//            case 5:
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("General school");
//                break;
//            case 9:
//            case 10:
//            case 11:
//            case 12:
//                System.out.println("High school");
//                break;
//            default:
//                System.out.println("You already graduated");
//        }


//        2. Declare a variable of type String opponentHand and initialize it with the value "rock"
//        The program will ask the user to provide one of the following: rock, paper or scissors.
//        Based on what the user provides, one of the following messages will be printed:
//        You won! / The computer won! / It's a draw!

//        String opponentHand = "rock";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter your hand");
//        String myHand = sc.nextLine();
//        switch (myHand){
//            case "rock":
//                System.out.println("It's a draw");
//                break;
//            case "scissors":
//                System.out.println("The computer won!");
//                break;
//            case "paper":
//                System.out.println("You won!");
//                break;
//            default:
//                System.out.println("This is not a valid hand");
//        }



//        3. Write a program that asks the user for his or her favorite programming language.
//        If the user enters "Java" the computer will print "The best programming language"
//        If the user enters "Python" the computer will print "That's a good language"
//        If the user enters "PHP" the computer will print "I don't think so"
//        If the user provides any other value, the test "I don't know that programming language yet" will be printed.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your favorite programming language?");
//        String programingLanguage = sc.nextLine();
//        switch (programingLanguage) {
//            case "java":
//                System.out.println("the best programing language");
//                break;
//            case "python":
//                System.out.println("That's a good language");
//                break;
//            case "php":
//                System.out.println("I don't think so");
//                break;
//            default:
//                System.out.println("I don't know that programming language yet");
//        }

//        4. Write a program that asks the user for a letter and prints "Vowel".
//        if the provided letter is a vowel, and "Consonant" if the provided letter is a consonant.
//        if the given character is a special character (exp * ^ & % $ # ,).
//        the program will print "special character"

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a character:");
//        char character = sc.nextLine().charAt(0);
//        switch (character){
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//                System.out.println("Vowel");
//                break;
//            case '!':
//            case '?':
//            case '#':
//            case '$':
//            case '@':
//            case '%':
//            case '^':
//            case '&':
//            case '*':
//            case '(':
//            case ')':
//            case '_':
//            case '-':
//            case '/':
////                and so on...
//                System.out.println("Special character");
//                break;
//                default:
//                System.out.println("Consonant");
//
//        }


//        5. Write a program that asks the user for a specific hour of the day.
//        Based of what the user provides, print a text describing your daily schedule at that given hour.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the time");
        int hour = sc.nextInt();
        switch (hour){
            case 8:
                System.out.println("I'm having the breakfast");
                break;
            case 9:
                System.out.println("I'm starting work");
                break;
            case 13:
                System.out.println("Break and launch");
                break;
            case 17:
                System.out.println(" I finish the work");
                break;
            case 19:
                System.out.println("I go to church");
                break;
            case 21:
                System.out.println("I go to sleep");
                break;
            default:
                System.out.println("The time is wrong");
        }
    }
}

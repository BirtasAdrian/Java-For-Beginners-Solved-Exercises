import java.util.Scanner;

public class theSwithchInstruction2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current month:");
        String month = sc.nextLine();
        switch (month){
            case "december":
            case "january":
            case "february":
                System.out.println("It's winter");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("It's spring");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("It's summer");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("It's autumn");
                break;
            default:
                System.out.println("You did not enter a valid month");


        }
    }
}

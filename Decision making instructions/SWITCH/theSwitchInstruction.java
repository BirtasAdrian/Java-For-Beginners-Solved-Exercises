import java.util.Scanner;

public class theSwitchInstruction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the color of the traffic light");
        String color = sc.nextLine();
        switch (color){
            case "red":
                System.out.println("We are waiting");
                break;
            case "green":
                System.out.println("You can cross the road");
                break;
            case "yellow":
                System.out.println("Better wait");
                System.out.println("Better safe than sorry");
                break;
            default:
                System.out.println("You did not enter a valid color");
                break;
        }
    }
}

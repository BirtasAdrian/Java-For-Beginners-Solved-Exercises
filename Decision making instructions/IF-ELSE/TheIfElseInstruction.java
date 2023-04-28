import java.util.Scanner;

public class TheIfElseInstruction {

    public static void main(String[] args) {

        Scanner reader  = new Scanner(System.in);
//        System.out.println("Please enter your age:");
//        int age = reader.nextInt();
//        if(age>=18){
//            System.out.println("You are an adult!");
//        }else{
//            System.out.println("You're a minor!");
//        }
//        System.out.println("The program is over");

        System.out.println("Please enter the color of the traffic light:");
        String color = reader.nextLine();
        if(color.equalsIgnoreCase("red")) {
            System.out.println("We are waiting");
        }else if(color.equalsIgnoreCase("yellow")){
            System.out.println("We are careful");
        }else if(color.equalsIgnoreCase("green")){
            System.out.println("We cross the street");
        }else {
            System.out.println("You din not enter a valid traffic light color.");
        }
    }
}

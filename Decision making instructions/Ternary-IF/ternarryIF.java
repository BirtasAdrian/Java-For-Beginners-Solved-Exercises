import java.util.Scanner;

public class ternarryIF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = sc.nextInt();
        if (age >=18){
            System.out.println("You're an adult");
        }else{
            System.out.println("You're a minor");
        }
// We can write ternarry operator like this or in console
//        String message = age >=18 ? "You're an adult" : "You're a minor";
//        System.out.println(message);

        System.out.println(age >=18 ? "You're and adult" : "You're a minor");
    }
}

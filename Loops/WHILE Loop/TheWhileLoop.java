import java.util.Scanner;

public class TheWhileLoop {
    public static void main(String[] args) {

//        String name = "Tudor";
//        int counter = 0;
//        while(counter < 10){
//            System.out.println(name);
//        }

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Please insert a number:");
            int number = sc.nextInt();
            if(number >100){
                System.out.println("Congrats");
                break;
            }else{
                System.out.println("You must enter a number greater than 100");

            }
        }

    }
}

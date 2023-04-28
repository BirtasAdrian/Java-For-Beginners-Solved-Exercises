public class ForLoopExercises1 {
    public static void main(String[] args) {

//        1. The text "Hello, my name is *yourName* and I will become a software tester."
//        will be printed 50 times.

//        String myName = "Adrian";
//
//        for(int i = 0; i <= 50; i++){
//
//            System.out.println("Hello, my name is " + myName + " and I will become a software tester");
//        }

//        2. Print all the even numbers between 3 and 50 on the same row.

//        for(int i = 3; i <= 50; i++){
//            if(i%2==0) {
//                System.out.print(i + " ");
//            }
//        }

// Another method

//        for( int i = 4; i <=50; i+=2){
//                System.out.print(i + " ");
//        }

//        3. Print all the numbers 4 by 4 between 0 and 50.

//        for( int i = 0; i <=50; i+=4){
//            System.out.println(i);
//        }


//        4. Print all the numbers in the interval (10-100) which are divided by 3.

//        for(int i = 10; i <= 100; i++) {
//            if (i % 3 ==0){
//                System.out.println(i);
//            }
//        }

//        5. Print all the numbers descending from  100 to 0.

//        for ( int i = 100; i >= 0; i--){
//            System.out.println(i);
//        }

//        6. Print all the numbers that are divisible by 5 descending from 100 to 1.

//        for (int i = 100; i >=1; i--){
//            if(i%5 == 0)
//                System.out.println(i);
//        }

//        Another method to solve the exercise

        for (int i = 100; i >=1; i-=5){
            System.out.println(i);
        }

    }
}

public class methodsExercises1 {

    public static void main(String[] args) {

//        hello("Adrian");
//        hello("Florin");
//        hello("Ionela");

//        compare(100, 200);
//        compare(60,50);
//        compare(50, 50);

//        isPositive(99);
//        isPositive(-5);

//        printTenTimes("Java");
//        printTenTimes("JavaScript");

        print("Adrian", 5);
        print("Java", 10);


    }


//    1. Write a method named hello() which takes a parameter of type String name and prints the text
//    "Hello there. My name is *name*". Call that method with 3 different names.

    public static void  hello(String name){
        System.out.println("Hello there. My name is " + name);
    }

//    2. Write a method called compare(), which takes 2 parameters of type int and prints which number
//    is the biggest. Call that method 3 times, to test each possible case.

    public static void compare(int number1, int number2){
        if(number1 > number2){
            System.out.println("The first number is bigger: " + number1);
        }else if(number2 > number1){
            System.out.println("The second number is bigger: " + number2);
        }else{
            System.out.println("The numbers are equal.");
        }
    }

//    3. Write a method that takes a number as a parameter and prints if the number is positive or not.
//    Give that method a corresponding name. Call that method 2 times.

    public static void isPositive(int number){
        System.out.println(number >=0 ? "The number is positive" : "The number is negative");
    }

//    4. Write a method that prints a given parameter of type string 10 times. Call that method 3 times.

    public static void printTenTimes(String text){
        for(int i = 0; i < 10; i++){
            System.out.println(text);
        }
    }

//    5. Write a method that prints a given text parameter x times, x also being a parameter of that method.

    public static void print(String text, int iterationCount){
        for(int i = 0; i<iterationCount; i++){
            System.out.println(text);
        }
    }

}

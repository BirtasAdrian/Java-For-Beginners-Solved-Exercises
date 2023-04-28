public class OperatorsExercises {
    public static void main(String[] args) {

        // 1. Declare 2 variables of type int : name them number 1 and number 2. Initialize and print them.
        
        int number1 = 100;
        int number2= 20;
        System.out.printf("The first number is %d and the second number is %d", number1, number2);
        System.out.println();

        // 2. Declare 4 variables : sum, difference, multiply and division.
        // Each one of these variables must contain th results of previous 2 variables operations.
        // Print the results.
       
        int sum = number1 + number2;
        int difference = number1 - number2;
        int multiply = number1 * number2;
        int division = number1 / number2;
//        System.out.println("The sum is equal to " + sum);
//        System.out.println("The difference is equal to " + difference);
//        System.out.println("The multiply is equal to " + multiply);
//        System.out.println("The division is equal to " + division);


        // 3. Declare 4 variables of type int, named sum, difference, multiply and division.
        // Each of them must contain the result of the second number from exercise 1 reported to the first.
        // See what happens.
        
        int sum2 = number2 + number1;
        int difference2 = number2 - number1;
        int multiply2 = number2 * number1;
        int division2 = number2 / number1;
//        System.out.println("The sum is equal to " + sum2);
//        System.out.println("The difference is equal to " + difference2);
//        System.out.println("The multiply is equal to " + multiply2);
//        System.out.println("The division is equal to " + division2);

        // 4. Declare  a variable number 3 and initialize it. Add the new variable to all previous results and display for each message
        // "After that I added number3 to the amount/ difference/- .. I got a result -"

        int number3 = 50;
        sum += number3;
        difference += number3;
        multiply += number3;
        division += number3;
        System.out.printf("After that I added %d to my sum, the result became %d \n", number3, sum);
        System.out.printf("After that I added %d to my difference, the result became %d \n", number3, difference);
        System.out.printf("After that I added %d to my multiply, the result became %d \n" , number3, multiply);
        System.out.printf("After that I added %d to my division, the result became %d \n", number3, division);

        // 5. Declare variable of type int and initialize it with whichever value you want.
        // Print its multiplication table.
        // yourNumber x 1 = result1
        // yourNumber x 2 = result2
        //-
        // yourNumber x 9 = result 9

        int number4 = 55;
        System.out.println(number4 + "x1 = " + (number4));
        System.out.println(number4 + "x2 = " + (number4*2));
        System.out.println(number4 + "x3 = " + (number4*3));
        System.out.println(number4 + "x4 = " + (number4*4));
        System.out.println(number4 + "x5 = " + (number4*5));
        System.out.println(number4 + "x6 = " + (number4*6));
        System.out.println(number4 + "x7 = " + (number4*7));
        System.out.println(number4 + "x8 = " + (number4*8));
        System.out.println(number4 + "x9 = " + (number4*9));

        // 6. Declare a variable which contains the rest of 100 divided by 27;
        // The text  "The rest of 100 divided by 27 is equal to "thatValue" should be printed in the console.

        int n1 = 100;
        int n2 = 27;
        int rest = 100 % 27;
        System.out.printf("The rest of 100 divided by 27 is equal to %d", n1, n2, rest);
    }
}

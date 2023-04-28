public class OperatorsExercises2 {
    public static void main(String[] args) {

        //1. Declare and initialize 2 variables of type int.
        //Declare the next variables of type boolean: firstIsBigger, secondIsBigger, theNumbersAreEqual.
        //Initialize the Boolean values based on your numbers.

        int number1 = 100;
        int number2 = 15;
        boolean firstIsBigger = number1 > number2;
        boolean secondIsBigger = number2 > number1;
        boolean theNumbersAreEqual = number1 == number2;
        System.out.println("Is the first bigger? " + firstIsBigger);
        System.out.println("Is the second bigger? " + secondIsBigger);
        System.out.println("Are the numbers equal? " + theNumbersAreEqual );

        //2. Declare a variable of type int and initialize it.
        //Print the text "We will increase our value by 1 in 3 different ways", and then, do so.
        //Finally, the text  "After we added 1 in 3 different ways" our variable value is equal
        //to * theModifiedValue * must be printed.

//        int myNumber = 5;
//        System.out.println("We will increase our value by 1 in 3 different ways");
//        myNumber = myNumber+1;
//        myNumber++;
//        myNumber +=1;
//        System.out.println("After we added 1 in 3 different ways, our variable value is equal " + myNumber);

        //3. Declare and initialize 2 variables of type int. One should be bigger than zero,
        //and the other should be less than zero.
        //Declare 3 variables of type Boolean named theSumIsGreaterThanZero, theDifferenceIsLessOrEqualToZero,
        //theMultiplicationIsGreaterThan100 and initialize them based on your two numbers.

//        int myValue1 = 5;
//        int myValue2 = -1;
//        boolean theSumIsGreaterThanZero = (myValue1 + myValue2) > 0;
//        boolean theDifferenceIsLessOrEqualToZero = (myValue1 - myValue2) <= 0;
//        boolean theMultiplicationIsGreaterThan100 = (myValue1 * myValue2) > 100;
//        System.out.println("The sum is greater than zero " + theSumIsGreaterThanZero);
//        System.out.println("The difference is less or equal to zero " + theDifferenceIsLessOrEqualToZero);
//        System.out.println("The multiplication is greater than 100 " + theMultiplicationIsGreaterThan100);

        //4. Declare four variables of type double and initialize them.
        //The following texts should be printed in the console.
        //"The average of x1, x2 and x3 is equal to * result *"
        //"The average of x1, x2 and x4 is equal to * result *"
        //"The average of x2, x3 and x4 is equal to * result *"

        double x1 = 22.5;
        double x2 = 33.3;
        double x3 = 44.5;
        double x4 = 66.8;
        double sum123 = x1 + x2 + x3;
        double sum124 = x1 + x2 + x4;
        double sum234 = x2 + x3 + x4;
        System.out.println("The average of x1, x2 and x3 is equal to " + (sum123/3));
        System.out.println("The average of x1, x2 and x4 is equal to " + (sum124/3));
        System.out.println("The average of x1, x3 and x4 is equal to " + (sum234/3));


    }
}

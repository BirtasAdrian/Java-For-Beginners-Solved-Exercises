import java.util.ArrayList;
import java.util.Arrays;

public class methodsExercises5 {
    public static void main(String[] args) {

//        int[] numbers = {34, 654, 34, 5, 9, 1, 888, 99, 77, 15};
//        printDescending(numbers);

//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(345, 555, 66, 6, 9, 589, 345, 100, 64, 88, 99));
//        printAscending(numbers);

        printFibonacci(5);
        printFibonacci(6);
        printFibonacci(7);
        printFibonacci(8);
        printFibonacci(9);

    }

//    1. Write a method that prints an integer vector passed as a parameter, ordered descending.

    public static void printDescending(int[] numbers){
        for(int i =0; i< numbers.length; i++){
            for(int j =i+1; j < numbers.length; j++){
                if(numbers[i] < numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();
    }

//    2. Write a method that prints an integer list passed as a parameter, ordered ascending.

    public static void printAscending(ArrayList<Integer> numbers){
        for(int i =0; i< numbers.size(); i++){
            for(int j =i+1; j < numbers.size(); j++){
                if(numbers.get(i) > numbers.get(j)){
                    int temp = numbers.get(i);
                   numbers.set(i, numbers.get(j));
                   numbers.set(j, temp);
                }
            }
        }
        for (int number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();
    }

//    3. Given the Fibonacci series 0 1 1 2 3 5 8 13 ...
//    Write a method that takes in a parameter of type int x and prints the x-th number in the Fibonacci series.
//    (In the Fibonacci series, each number is the sum of previous 2)

    public static void printFibonacci(int x){
        if (x == 0 || x == 1){
            System.out.println(x);
        }else{
            ArrayList<Integer> fibonacciSeries = new ArrayList<>();
            fibonacciSeries.add(0);
            fibonacciSeries.add(1);
            for(int i = 2; i <= x; i++){
                fibonacciSeries.add(fibonacciSeries.get(i-1) + fibonacciSeries.get(i-2));
            }
            System.out.println(fibonacciSeries.get(x));
        }
    }

}

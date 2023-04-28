import java.util.Arrays;

public class ArraysExecises1 {
    public static void main(String[] args) {

//        1. Declare an array of strings that contains the name of 10 people.
//        Print the 3rd and 7th person on the same row, separate by whitespace, 3 times.

//        String[] names = new String[10];
//        names[0] = "Adrian";
//        names[1] = "Florin";
//        names[2] = "Mihai";
//        names[3] = "Alina";
//        names[4] = "Maria";
//        names[5] = "Andrew";
//        names[6] = "Florian";
//        names[7] = "Angel";
//        names[8] = "Mirela";
//        names[9] = "Anton";
//
////        Mihai Florian will be displayed 3 times on the same row with the help of this for.
//
//             for (int i = 0; i < 3; i++)  {
//            System.out.print(names[2] + " " + names[6] + " ");
//        }

//        2. Declare an array of size 6 named fruits. Add fruits in that array using the index.

//        String[] fruits = new String[6];
//        fruits[0] = "apples";
//        fruits[1] = "pears";
//        fruits[2] = "mango";
//        fruits[3] = "bananas";
//        fruits[4] = "watermelon";
//        fruits[5] = "strawberry";
//        for (String fruit : fruits){
//            System.out.println(fruit);
//        }

//        3. Declare an array of 12 numbers. Print its values firstly on the same row, separated by whitespace.
//        and after that, on different rows.

//        int[] numbers = {1, 43, 65, 8, 54, 768, 534, 234, 645, 765, 32, 2};
//        for(int i = 0; i < numbers.length; i++){
//            System.out.print(numbers[i] + " ");
//        }
//        for (int number : numbers){
//            System.out.println(number);
//        }

//        4. Declare an array of strings with 8 empty slots. Fill the array with values.
//        Sort the array alphabetically and then print the values.

//        String[] array = new String[8];
//        array[0] = "demo";
//        array[1] = "hello";
//        array[2] = "My name is Adrian";
//        array[3] = "I like Shawarma";
//        array[4] = "Java";
//        array[5] = "Python";
//        array[6] = "Love";
//        array[7] = "Chocolate";
//
//        Arrays.sort(array);
//        for(String text : array){
//            System.out.println(text);
//        }

//        5. Declare an array of type float with 6 empty slots.
//        Fill the array with values and then print the sum of all the numbers in that array.

        float[] floatNumbers = new float[6];
        Arrays.fill(floatNumbers, 5F);
        int sum = 0;
        for(float number : floatNumbers){
            System.out.println(number);
            sum += number;
        }
        System.out.println("The sum of all the elements in your array is equal to " + sum);
    }
}

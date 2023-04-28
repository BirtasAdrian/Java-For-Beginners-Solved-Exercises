import java.util.Arrays;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {

        int[] numbers = {34, 54, 76, 12, 3, 123, 76, 5, 8, 98};
//        Arrays.sort(numbers);

//        This is the Bubble Sort Algorithm
        for (int i =0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i] > numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}

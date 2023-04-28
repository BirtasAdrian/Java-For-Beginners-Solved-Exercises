import java.util.*;

public class ArrayListExercises2b {
    public static void main(String[] args) {

//        1. Declare an array of 5 slots and insert a random generated number in each slot.
//        Copy all the array elements in a list and then print that list in 2 different ways.

//        int[] numbers = new int[5];
//        Random generator = new Random();
//        for(int i = 0; i< numbers.length; i++){
//            int generatedNumber = generator.nextInt(100);
//            numbers[i] = generatedNumber;
//        }
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int number: numbers){
//            list.add(number);
//        }
//        for (int i = 0; i< list.size(); i++){
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println();
//        for(int number : list){
//            System.out.print(number + " ");
//        }

//        2. Declare a new list of type String in which the user will insert words up until the next "stop" is
//        provided. Sort that list alphabetically and then print all the values on the same row, separated by whitespace.

//        Scanner sc = new Scanner(System.in);
//        ArrayList<String> list = new ArrayList<>();
//
//        while(true){
//            System.out.println("Enter a text");
//            String text = sc.nextLine();
//            if(text.equals("stop")){
//                break;
//            }else{
//                list.add(text);
//            }
//        }
//        Collections.sort(list);
//
//        for(String item : list){
//            System.out.println(item + " ");
//        }

//        3. Declare a list of type double containing the budget for each month in the next year.
//        Declare a list of type double containing all the monthly spending in the next year.
//        If a given month spending is greater than its budget, the text
//        "Month 1/2/3? Spending is greater than the allocated budget".
//        Print a message specifying how much money will you have left (or not) in that year.

        ArrayList<Double> monthlyBudget = new ArrayList<>();
        monthlyBudget.add(345.6);
        monthlyBudget.add(455.3);
        monthlyBudget.add(65.4);
        monthlyBudget.add(100.4);
        monthlyBudget.add(500.5);
        monthlyBudget.add(800.7);
        monthlyBudget.add(999.3);
        monthlyBudget.add(885.3);
        monthlyBudget.add(6565.8);
        monthlyBudget.add(555.3);
        monthlyBudget.add(689.8);
        monthlyBudget.add(566.9);

        ArrayList<Double> monthlySpendings = new ArrayList<>(Arrays.asList(100.6, 55.1, 555.1, 695.5, 999.1,
                655.1, 555.1, 333.1, 695.1, 456.5, 999.2, 102.5));

        double totalBudget = 0.0;
        double totalSpendings = 0.0;

        for(int i = 0; i<monthlySpendings.size(); i++){
            totalBudget+= monthlyBudget.get(i);
            totalSpendings+= monthlySpendings.get(i);
            if(monthlyBudget.get(i) < monthlySpendings.get(i)){
                System.out.println("The expenses of month " + (i+1) + " exceed the allocated  budget");
            }
        }

        double stats = totalBudget-totalSpendings;
        if(stats>0){
            System.out.println("At the end of the year we will be left with " + stats);
        }else{
            System.out.println("At the end of the year we will be left with minus" + -stats);
        }


    }
}

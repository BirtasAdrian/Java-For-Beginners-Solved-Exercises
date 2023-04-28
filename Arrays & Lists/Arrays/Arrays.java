public class Array {
    public static void main(String[] args) {

//        String [] cars = {"Audi", "Bmw", "Volvo", "Renault"};
//        for (String car : cars){
//            System.out.println(car);
//        }

        String [] nameArray = new String [4];
        nameArray[0] = "Adrian";
        nameArray[1] = "Florin";
        nameArray[2] = "Mihai";
        for (int index = 0; index < nameArray.length; index++){
            System.out.print(nameArray[index] + " ");
        }
        System.out.println();

//        Here the array will be printed decrement, from the last element to the first
        for (int index = nameArray.length - 1; index >=0; index --){
            System.out.print(nameArray[index] + " ");
        }

        System.out.println();
        for (String name : nameArray){
            System.out.print(name + " ");
        }
    }
}

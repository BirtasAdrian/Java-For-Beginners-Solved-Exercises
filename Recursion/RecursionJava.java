public class RecursionJava {
    public static void main(String[] args) {

        System.out.println(factorialRecursion(5));
        System.out.println(factorialRecursionTernary(5));
    }

    public static int factorialRecursion(int number){
        if(number==1){
            return 1;
        }else{
            return number * factorialRecursion(number - 1);
        }
    }
// The second way to write the method for the factorial number

    public static int factorialRecursionTernary(int number){
        return number == 1 ? 1 : number *factorialRecursion(number - 1);
    }
}

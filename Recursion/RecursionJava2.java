public class RecursionJava2 {
    public static void main(String[] args) {

        System.out.println(getDigitsNumber(1));
        System.out.println(getDigitsNumber(555));
        System.out.println(getDigitsNumber(50000));

        System.out.println(getDigitsnumberTernary(1));
        System.out.println(getDigitsnumberTernary(555));
        System.out.println(getDigitsnumberTernary(50000));

    }
//        1. Write a method that returns the number of digits in a number passed as a parameter
//        ex 12 => 2, 123 => 3,  4500 => 4 etc

        public static int getDigitsNumber(int number){
            if(number/10 == 0){
                return 1;
            }else{
                return 1 + getDigitsNumber(number/10);
            }

    }

    public static int getDigitsnumberTernary(int number){
        return number / 10 == 0 ? 1 : 1 +getDigitsnumberTernary(number / 10);
    }
}

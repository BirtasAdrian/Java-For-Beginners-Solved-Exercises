public class Operators {
    public static void main(String[] args) {

        //mathematical operators
        // + - * / |
        System.out.println(10+10);
        System.out.println(100-55);
        System.out.println(50*3);
        System.out.println(9/3);
        System.out.println(5%2);

        //relational operators
        System.out.println(7 == 8);
        System.out.println(8 == 8);
        System.out.println(8 != 8);
        System.out.println(8 != 9);
        System.out.println(8 + 5 < 10);
        System.out.println(8 <= 10);

        // logical operators
        System.out.println(8 < 10 && 7 < 10);
        System.out.println(100 < 1000 || 9 > 1000);
        System.out.println(!(1>10));

        // assignment operators
        int number = 8;
        number++;
        System.out.println(number);

        int number2 = 9;
        number2--;
        System.out.println(number2);

        int number3 = 12;
        number3 += 20;
        System.out.println(number3);

    }
}

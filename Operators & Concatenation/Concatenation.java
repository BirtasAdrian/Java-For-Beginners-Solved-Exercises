public class Concatenation {
    public static void main(String[] args) {
        int number = 15;
        String text = "test";
        double doubleNumber = 55.5;
        float floatNumber = 66.5F;
        boolean truth = true;
        char b = '*';
        System.out.println("My string variable has the value " + text);
        System.out.println("My number is " + number);
        System.out.println(doubleNumber + " is my double number");
        System.out.println(floatNumber + " is my float number");
        System.out.println("I have declared a character with the value " + b);
        System.out.printf("I have declared a string variable with the value %s", text);
        System.out.println();
        System.out.printf("I have declared an int variable with the value %d", number);
        System.out.println();
        System.out.printf("I have declared a double variable with the value %f and a string with the value %s", doubleNumber, text);
        System.out.println();
        System.out.printf("I have declared a boolean variable with the value %b", truth);
    }
}

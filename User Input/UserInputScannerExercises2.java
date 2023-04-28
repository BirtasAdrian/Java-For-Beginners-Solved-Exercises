import java.util.Scanner;

public class UserInputScannerExercises2 {

    public static void main(String[] args) {

//        1. Write a program that asks the user for a circle radius,
//        and then calculates and prints the circle perimeter and area. (Search for the formula on Google)

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the circle radius:");
//        double radius = sc.nextDouble();
////      If it's need, instead of 3.14 we can us Math.PI that has the same value
//        double perimeter = 2 * 3.14 * radius;
////      If it's need, instead of radius * radius we can use Math.pow(radius, 2), this calculate the number at a certain power
//        double area = 3.14 * radius * radius;
//        System.out.println("The perimeter of the circle has the value " + perimeter);
//        System.out.println("The area of the circle has the value " + area);

//        2. Write a program that asks the user to enter the length of a rectangle, then its width.
//        Calculate the rectangle area and perimeter based on the data provided by the user, and print
//        the following texts:
//        "The area/perimeter of a rectangle having *value1* length and *value2* width is equal to *result*"

//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter the length of the rectangle:");
//        int length = reader.nextInt();
//        System.out.println("Enter the width of the rectangle:");
//        int width = reader.nextInt();
//        int perimeter = 2 * length  + 2  * width;
//        int area = length * width;
//        System.out.printf("The perimeter of the rectangle of length %d and width %d is equal to %d \n", length, width, perimeter);
//        System.out.printf("The area of the rectangle of length %d and width %d is equal to %d", length, width, area);

//        3. Write a program that asks the user for the current time (only the hour must be provided)
//        and the prints how many hours are left until midnight.

//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter the current time:");
//        int hour = reader.nextInt();
//        System.out.println("There are " +(24-hour) + " hours left until midnight");

//        4. Write a program that asks the user for his birth year and prints how old is he/she.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the year of birth:");
//        int year = sc.nextInt();
//        int age = 2023 - year;
//        System.out.printf("Your are " + age + " years old");

//        5. Write a program that asks the user how many page his or her books has,
//        and then asks how many pages does he or she intend to read per day.
//        The text "You will finish that book in *response* days" will be printed in the console.

        Scanner sc = new Scanner(System.in);
        System.out.println("How many pages does your book have?");
        int numberOfPages = sc.nextInt();
        System.out.println("How many pages do you intend to read per day?");
        int pagerPerDay = sc.nextInt();
        System.out.printf("At this rate. you will finish the book in " + (numberOfPages/pagerPerDay) + " days.");

    }
}

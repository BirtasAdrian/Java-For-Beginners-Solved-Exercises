import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercises3c {
    public static void main(String[] args) {

//        1. Declare 4 lists and name them englishGrades, frenchGrades, mathGrades, and sportsGrades
//        The user will provide 3 grades for each subject. (the grades must be between 1 and 10)
//        Calculate the average of each subject, and then the final average.
//        Finally, print a message in the following format:
//        English : grade 1 grade 2 grade 3 - Average : average1
//        French : grade 1 grade 2 grade 3 - Average : average2
//        Math : grade 1 grade 2 grade 3 - Average : average3
//        Sports : grade 1 grade 2 grade 3 - Average : average4
//        Final grade: X
//        PASSED/FAILED
//        *A student will pass if the final average is greater than 5.

        ArrayList<Double> englishGrades = new ArrayList<>();
        ArrayList<Double> frenchGrades = new ArrayList<>();
        ArrayList<Double> mathGrades = new ArrayList<>();
        ArrayList<Double> sportsGrades = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int englishGradeCount = 0;
        while (englishGradeCount < 3) {
            System.out.println("Enter an english grade: ");
            double grade = sc.nextDouble();
            if (grade >= 1 && grade <= 10) {
                englishGrades.add(grade);
                englishGradeCount++;
            } else {
                System.out.println("You can only provide grades between 1 and 10 inclusive!");
            }
        }

        int frenchGradeCount = 0;
        while (frenchGradeCount < 3) {
            System.out.println("Enter a french grade: ");
            double grade = sc.nextDouble();
            if (grade >= 1 && grade <= 10) {
                frenchGrades.add(grade);
                frenchGradeCount++;
            } else {
                System.out.println("You can only provide grades between 1 and 10 inclusive!");
            }
        }
        int sportsGradeCount = 0;
        while (sportsGradeCount < 3) {
            System.out.println("Enter a sports grade: ");
            double grade = sc.nextDouble();
            if (grade >= 1 && grade <= 10) {
                sportsGrades.add(grade);
                sportsGradeCount++;
            } else {
                System.out.println("You can only provide grades between 1 and 10 inclusive!");
            }
        }

        int mathGradeCount = 0;
        while (mathGradeCount <3){
            System.out.println("Enter a math grade: ");
            double grade = sc.nextDouble();
            if(grade>=1 &&  grade <=10 ){
                mathGrades.add(grade);
                mathGradeCount++;
            }else{
                System.out.println("You can only provide grades between 1 and 10 inclusive!");
            }
    }


        double totalEnglish = 0.0;
        double totalSports = 0.0;
        double totalMath = 0.0;
        double totalFrench = 0.0;

        for(double grade : englishGrades){
            totalEnglish+=grade;
        }

        for(double grade : mathGrades){
            totalMath+=grade;
        }

        for(double grade : sportsGrades){
            totalSports+=grade;
        }

        for(double grade : frenchGrades){
            totalFrench+=grade;
        }

        double sportsAverage = totalSports / 3;
        double mathAverage = totalMath / 3;
        double englishAverage = totalEnglish / 3;
        double frenchAverage = totalFrench / 3;

        double finalAverage =(sportsAverage + mathAverage + englishAverage + frenchAverage) / 4;
        System.out.println("English grades : " + englishGrades.get(0) + " " + englishGrades.get(1) + " "
                + englishGrades.get(2) + " Average:" + englishAverage);

        System.out.println("Math grades : " + mathGrades.get(0) + " " + mathGrades.get(1) + " "
                + mathGrades.get(2) + " Average:" + mathAverage);

        System.out.println("Sports grades : " + sportsGrades.get(0) + " " + sportsGrades.get(1) + " "
                + sportsGrades.get(2) + " Average:" + sportsAverage);

        System.out.println("French grades : " + frenchGrades.get(0) + " " + frenchGrades.get(1) + " "
                + frenchGrades.get(2) + " Average:" + frenchAverage);

        System.out.println("Final average : " + finalAverage);

        System.out.println(finalAverage>=5 ? "PASSED" : "FAILED");

}
    }

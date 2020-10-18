package ChallengeProblems;

import java.util.Scanner;

public class CbseMarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Name of Student");
        String nameOfStudent = sc.nextLine();
        System.out.printf("Enter the Marks in Computer Science : ");
        int computerMarks = sc.nextInt();
        System.out.printf("Enter the Marks in English : ");
        int englishMarks = sc.nextInt();
        System.out.printf("Enter the Marks in Maths : ");
        int mathsMarks = sc.nextInt();
        System.out.printf("Enter the Marks in Physics : ");
        int physicsMarks = sc.nextInt();
        System.out.printf("Enter the Marks in Chemistry : ");
        int chemistryMarks = sc.nextInt();
        int totalMarks = computerMarks + chemistryMarks + englishMarks + physicsMarks + mathsMarks;
        float percentageOfStudent = totalMarks / 5;
        float cgpaOfStudent = percentageOfStudent / 10;
        System.out.printf("The Student %s has a percentage of : %f % and secure a CGPA of : %f", nameOfStudent,
                percentageOfStudent, cgpaOfStudent);
        sc.close();
    }
}

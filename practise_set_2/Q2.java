package practise_set_2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Marks of the Student : ");
        int marks = sc.nextInt();
        int encryptMarks = marks + 8;
        System.out.printf("The Encrypted marks of the student is : %d \n The Original maks of the Student is :  %d",
                encryptMarks, marks);
        sc.close();
    }
}

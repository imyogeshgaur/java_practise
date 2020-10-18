package practise_set_1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("The Marks of Subject 1 is : ");
        int m1 = sc.nextInt();
        System.out.printf("The Marks of Subject 2 is : ");
        int m2 = sc.nextInt();
        System.out.printf("The Marks of Subject 3 is : ");
        int m3 = sc.nextInt();
        sc.close();
        double CGPA = (m1 + m2 + m3) / 30;
        System.out.print("The CGPA of the student is : " + CGPA);
    }
}

package practise_set_4;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Your Name : ");
        String nameOfUser = sc.nextLine();
        System.out.printf("Enter the Salary : ");
        int salUser = sc.nextInt();
        sc.close();
        float taxAmount = 0;
        if (salUser < 250000) {
            taxAmount = salUser * 0;
        } else if (salUser >= 250000 && salUser < 500000) {
            taxAmount = salUser / 20;
        } else if (salUser >= 500000 && salUser < 1000000) {
            taxAmount = salUser / 5;
        } else if (salUser >= 1000000) {
            taxAmount = salUser / 0.3f;
        }
        System.out.printf("%s have to pay %f amount", nameOfUser, taxAmount);
    }
}

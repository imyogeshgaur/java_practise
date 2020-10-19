package practise_set_5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Number : ");
        int num = sc.nextInt();
        sc.close();
        int fact = 1;
        for (int i = 1; i <= num; i++)
            fact *= i;
        System.out.printf("The Factorial of the Number is : %d", fact);
    }
}

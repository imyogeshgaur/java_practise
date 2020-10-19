package practise_set_5;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Number : ");
        int num = sc.nextInt();
        sc.close();
        int fact = 1, i = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }
        System.out.printf("The Factorial of the Number is : %d", fact);
    }
}

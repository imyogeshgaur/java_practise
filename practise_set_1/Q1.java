package practise_set_1;

import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter ther Value of First Number : \n");
        int num1 = sc.nextInt();
        System.out.printf("Enter the Value of the Second Number : \n");
        int num2 = sc.nextInt();
        int num3 = num1 + num2;
        System.out.print("The Sum of the Numbers is : " + num3);
        sc.close();
    }
}

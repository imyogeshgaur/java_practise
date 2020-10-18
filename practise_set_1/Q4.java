package practise_set_1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Distance in Kilometers : ");
        int kilo = sc.nextInt();
        sc.close();
        float mile = kilo / 1.609f;
        System.out.printf("For %d km miles equivalent is : %f", kilo, mile);
    }
}

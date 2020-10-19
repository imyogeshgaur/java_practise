package practise_set_6;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.printf("Enter the Size of the Array : ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.printf("Enter the Elements in Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        sc.close();
       System.out.printf("The Sum of Array is : %d",sum);
    }
}

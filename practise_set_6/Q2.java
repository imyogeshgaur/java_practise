package practise_set_6;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Size of the Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.printf("Enter the Array : ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        System.out.printf("Enter the Element You Wanna Search : ");
        int elem = sc.nextInt();
        sc.close();
        boolean found = false;
        for (int n : arr) {
            if (n == elem) {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println(elem + " is found.");
        else
            System.out.println(elem + " is not found.");
    } 
}

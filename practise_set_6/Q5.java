package practise_set_6;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, temp;
        System.out.printf("Enter the Size of Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.printf("Enter the Array : ");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.printf("The Array You Entered is : ");
        for (i = 0; i < size; i++) {
            System.out.printf("%d ", arr[i]);
        }
        j = i - 1;
        i = 0;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.printf("The Revesed Array is : ");
        for (i = 0; i < size; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}

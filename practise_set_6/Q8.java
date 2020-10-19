package practise_set_6;

import java.util.Scanner;

public class Q8 {
    static int sortTheArray(int arr[], int n) {

        if (n == 1 || n == 0)
            return 1;

        if (arr[n - 1] < arr[n - 2])
            return 0;

        return sortTheArray(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size of Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.printf("Enter the Array !!!");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        sc.close();
        int res = sortTheArray(arr, size);
        if (res != 0)
            System.out.printf("The Array is Sorted !!!");
        else
            System.out.printf("The Array is not Sorted !!!");
    }
}

package practise_set_6;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter size of the Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int max=arr[0];
        System.out.printf("Enter the Array : ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        max = arr[0];
        for(int i = 0; i < size; i++){
                if(max < arr[i])
                {
                    max = arr[i];
                }
            }
        System.out.printf("The Greatest Element is : %d ", max);
        sc.close();
    }
}

package practise_set_6;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter size of the Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int min=arr[0];
        System.out.printf("Enter the Array : ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        min = arr[0];
        for(int i = 0; i < size; i++){
                if(min > arr[i])
                {
                    min = arr[i];
                }
            }
        System.out.printf("The Smallest Element is : %d ", min);
        sc.close();

    }
}

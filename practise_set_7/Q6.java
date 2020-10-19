package practise_set_7;

import java.util.Scanner;

public class Q6 {
    static float findAverage(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float avg = sum / n;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Size of set : ");
        int size = sc.nextInt();
        int set[] = new int[size];
        System.out.printf("Enter the Set : ");
        for (int i = 0; i < size; i++)
            set[i] = sc.nextInt();
        sc.close();
        float res = findAverage(set, size);
        System.out.printf("the average of the Set is : %f", res);
    }
}

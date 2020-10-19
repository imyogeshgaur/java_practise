package practise_set_5;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, num;
        System.out.printf("Enter the Number : ");
        num = sc.nextInt();
        sc.close();
        while (i <= 10) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
    }
}

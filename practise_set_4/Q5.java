package practise_set_4;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Year of Your Choice : ");
        int yearOfChoice = sc.nextInt();
        sc.close();
        if (yearOfChoice % 4 == 0)
            System.out.printf("The Year is a Leap Year !!!");
        else
            System.out.printf("The Year is an Ordinary Year !!!");
    }
}

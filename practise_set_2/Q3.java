package practise_set_2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please Enter Your Choice !!!");
        int num1 = sc.nextInt();
        sc.close();
        if (num1 > 89)
            System.out.printf("Your Number is Greater !!!");
        else
            System.out.printf("Your Number is Smaller !!!");
    }
}

package practise_set_4;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Website URL : ");
        String URL = sc.nextLine();
        sc.close();
        if (URL.endsWith(".com"))
            System.out.printf("It is a Commercial Website !!!");
        if (URL.endsWith(".org"))
            System.out.printf("It is an Organisation Website !!!");
        if (URL.endsWith(".in"))
            System.out.printf("It is an Indian Website !!!");
    }
}

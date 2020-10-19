package practise_set_7;

import java.util.Scanner;

public class Q5 {
    static int nfiboTerm(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return (nfiboTerm(num - 1) + nfiboTerm(num - 2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Nth term : ");
        int N = sc.nextInt();
        sc.close();
        int res = nfiboTerm(N);
        System.out.printf("The %d term of the Fibonacci Series is : %d", N, res);
    }
}

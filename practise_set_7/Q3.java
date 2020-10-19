package practise_set_7;

import java.util.Scanner;

public class Q3 {
    static int addNaturalNumbers(int n) {
        if (n != 0)
            return n + addNaturalNumbers(n - 1);
        else
            return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Range : ");
        int N = sc.nextInt();
        sc.close();
        int sum = addNaturalNumbers(N);
        System.out.printf("The sum of %d natural Numbers is : %d", N, sum);
    }
}

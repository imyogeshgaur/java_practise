package practise_set_7;

import java.util.Scanner;

public class Q10 {
    static int addNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
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

package practise_set_5;

import java.util.Scanner;

public class Q2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int sum = 0, i = 1;
      System.out.printf("Enter the value of N : ");
      int N = sc.nextInt();
      sc.close();
      while (i <= 2 * N) {
         if (i % 2 == 0)
            sum += i;
         i++;
      }
      System.out.printf("The sum of the first N even number is : %d", sum);
   }
}

package practise_set_7;

import java.util.Scanner;

public class Q1 {
static void multiplyTheNumber(int num){
  for (int i = 1; i <=10; i++)
    System.out.printf("%d * %d = %d \n",num,i,num*i);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Number : ");
        int n = sc.nextInt();
        sc.close();
        multiplyTheNumber(n);
    }
}

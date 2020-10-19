package practise_set_6;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat1[][] = new int[2][3];
        int mat2[][] = new int[2][3];
        int sum[][] = new int[2][3];
        System.out.printf("Enter the First Matix : ");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                mat1[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
        System.out.printf("Enter the Seconf Matrix : ");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                mat1[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
        sc.close();
        System.out.printf("The Sum of two Matrices is : ");
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
                System.out.printf("%d",sum[i][j]);
            }
            System.out.println("");
        }
    }
}

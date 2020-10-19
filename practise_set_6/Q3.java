package practise_set_6;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum=0;
        float avg;
        System.out.printf("Enter the Total Number of Students : ");
        int size = sc.nextInt();
        float marks [] = new float[size];
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("Enter the Marks of Student %d in Physics : ",i+1);
            marks[i] = sc.nextFloat();
            sum += marks[i];
        }
        avg = sum/size;
        sc.close();
        System.out.printf("The Average marks of Students in Physics is : %f",avg);
    }
}

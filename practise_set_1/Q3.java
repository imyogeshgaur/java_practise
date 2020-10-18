package practise_set_1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Your Name : ");
        String name = sc.nextLine();
        sc.close();
        System.out.printf("Have a nice day %s",name);
}

}
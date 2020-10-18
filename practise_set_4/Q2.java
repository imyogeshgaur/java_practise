package practise_set_4;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("We assume that Max marks is 100 !!!\n");
        System.out.printf("Enter the Subject 1 Marks : ");
        int mk1 = sc.nextInt();
        System.out.printf("Enter the Subject 2 Marks : ");
        int mk2 = sc.nextInt();
        System.out.printf("Enter the Subject 3 Marks : ");
        int mk3 = sc.nextInt();
        int tot = mk1 + mk2 + mk3;
        if (mk1 < 33 && !(tot / 3 < 40)) {
            System.out.printf("The Student fails in Subject 1 ");

        }
        if (mk2 < 33 && !(tot / 3 < 40)) {
            System.out.printf("The Student fails in Subject 2 ");
        }
        if (mk3 < 33 && !(tot / 3 < 40)) {
            System.out.printf("The Student fails in Subject 3 ");
        }
        if (tot / 3 < 40) {
            System.out.printf("The Student Fails !!!");
        }
        sc.close();
    }
}

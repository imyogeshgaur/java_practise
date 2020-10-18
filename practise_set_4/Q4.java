package practise_set_4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Your Favourite Number from 1-7 : ");
        int num = sc.nextInt();
        sc.close();
        switch (num) {
            case 1:
                System.out.printf("Your Day is Monday ");
                break;
            case 2:
                System.out.printf("Your Day is Tuesday ");
                break;
            case 3:
                System.out.printf("Your Day is Wednesday");
                break;
            case 4:
                System.out.printf("Your Day is Thrusday");
                break;
            case 5:
                System.out.printf("Your Day is Friday");
                break;
            case 6:
                System.out.printf("Your Day is Saturday");
                break;
            case 7:
                System.out.printf("Your Day is Sunday");
                break;
            default:
                System.out.printf("Wrong Input !!!");
                break;
        }
    }
}

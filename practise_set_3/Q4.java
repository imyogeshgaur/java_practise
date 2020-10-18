package practise_set_3;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count1 = 0;
        int count2 = 0;
        System.out.printf("Enter Your String : ");
        String userString = sc.nextLine();
        sc.close();
        for (int i = 0; i < userString.length(); i++) {
            if (userString.equals("  "))
                count1++;
            if (userString.equals("   "))
                count2++;
        }
        System.out.printf("The total Double spaces in the string : %d \nThe total Triple spaces in the string : %d",
                count1, count2);
    }

}

package practise_set_3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please Enter Your String : ");
        String userInput = sc.nextLine();
        sc.close();
        System.out.printf("The Original String is : %s \nThe Lowercase String is : %s ", userInput,
                userInput.toLowerCase());
    }
}

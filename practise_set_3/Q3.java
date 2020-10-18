package practise_set_3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        String templateString = "Dear name thanks for Supporting me !!!";
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please Enter Your Name : ");
        String nameOfUser = sc.nextLine();
        sc.close();
        String generatedString = templateString.replace("name", nameOfUser);
        System.out.printf("The Template String is : %s \nThe Generated String is : %s", templateString,
                generatedString);
    }
}

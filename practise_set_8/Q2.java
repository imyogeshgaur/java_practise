package practise_set_8;

import java.util.Scanner;

class Phone {
    public void Ringing() {
        System.out.printf("The Phone is Ringing !!!");
    }

    public void Vibrating() {
        System.out.printf("The Phone is Vibrating !!!");
    }

    public void Silent() {
        System.out.printf("The Phone is Silent !!!");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone ph = new Phone();
        System.out.printf("Enter 1 for sound and 2 to Vibrate : \n");
        System.out.printf("Enter the State of Phone : ");
        int state = sc.nextInt();
        sc.close();
        if (state == 1)
            ph.Ringing();
        else if (state == 2) {
            ph.Vibrating();
        } else
            ph.Silent();
    }
}

package practise_set_11;

import java.util.Scanner;

abstract class Pen {
    int inkQuantity;

    abstract void write(int inkQuantity);

    abstract void refile();
}

class Writer extends Pen {
    @Override
    void write(int ink) {
        if (ink > 75 && ink <= 100) {
            System.out.println("Your can write without any probelem !!!");
        } else if (ink >= 50 && ink <= 75) {
            System.out.println("You can face some issue while Writing !!!");
        } else {
            refile();
        }
    }

    @Override
    void refile() {
        System.out.println("Refil Your Pen !!!");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Much Ink Your Pen has ? ");
        int inkInRefil = sc.nextInt();
        sc.close();
        Writer w = new Writer();
        w.write(inkInRefil);
    }
}

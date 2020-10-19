package practise_set_8;

import java.util.Scanner;

class Square {
    int side;

    public void setSide(int s) {
        side = s;
    }

    public void getArea() {
        System.out.printf("The Area of the Square is : %d ", side * side);
    }

    public void getPerimeter() {
        System.out.printf("\nThe Perimeter of the Square is : %d ", side * 4);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square sq = new Square();
        System.out.printf("Enter the Side of the Sqare : ");
        int side = sc.nextInt();
        sc.close();
        sq.setSide(side);
        sq.getArea();
        sq.getPerimeter();
    }
}

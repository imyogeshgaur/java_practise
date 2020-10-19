package practise_set_8;

import java.util.Scanner;

class Rectangle {
    int Length;
    int Breadth;

    public void setLengthBreadth(int l, int b) {
        Length = l;
        Breadth = b;
    }

    public void getArea() {
        System.out.printf("The Area of the Recatangle is : %d", Length * Breadth);
    }

    public void getPerimeter() {
        System.out.printf("\nThe Perimeter of the Rectangle is : %d ", 2 * (Length + Breadth));
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        System.out.printf("Enter the Length of the Rectangle : ");
        int length = sc.nextInt();
        System.out.printf("Enter the Breadth of the Rectangle : ");
        int breadth = sc.nextInt();
        sc.close();
        rect.setLengthBreadth(length, breadth);
        rect.getArea();
        rect.getPerimeter();
    }
}

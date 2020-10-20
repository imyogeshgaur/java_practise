package practise_set_9;

import java.util.Scanner;

class newnewnewCylinder {
    private float radius;
    private float height;
    private int length;
    private int breadth;

    public newnewnewCylinder(float r, float h) {
        radius = r;
        height = h;
    }

    public newnewnewCylinder(int l, int b) {
        length = l;
        breadth = b;
    }

    // public int getRadius() {
    // return radius;
    // }

    // public int getHeight() {
    // return height;
    // }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.printf("Set the Radius of the Cylinder : ");
        // int Radius = sc.nextInt();
        // System.out.printf("Enter the Height of the Cylinder : ");
        // int Height = sc.nextInt();
        System.out.printf("Enter the Length of the Cylinder : ");
        int Length = sc.nextInt();
        System.out.printf("Set the Breadth of the Cylinder : ");
        int Breadth = sc.nextInt();
        sc.close();
        newnewnewCylinder nnncy = new newnewnewCylinder(Length, Breadth);
        Length = nnncy.getLength();
        Breadth = nnncy.getBreadth();
        System.out.printf("The Radius of the Cylinder is : %d \nThe Height of the Cylinder is : %d", Length, Breadth);
    }
}

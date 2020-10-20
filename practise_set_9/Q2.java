package practise_set_9;

import java.util.Scanner;

class newCylinder {
    private int radius;
    private int height;

    public void setRadius(int r) {
        radius = r;
    }

    public void setHeight(int h) {
        height = h;
    }

    public double calcArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double calcVolume() {
        return Math.PI * radius * radius * height;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        newCylinder ncy = new newCylinder();
        System.out.printf("Enter the Radius of the Cylinder : ");
        int Radius = sc.nextInt();
        System.out.printf("Enter the Height of the Cylinder : ");
        int Height = sc.nextInt();
        ncy.setHeight(Height);
        ncy.setRadius(Radius);
        double Area = ncy.calcArea();
        double Volume = ncy.calcVolume();
        System.out.printf("The Area of the Cylinder is : %f \nThe Volume of the Cylinder is : %f", Area, Volume);
        sc.close();
    }
}

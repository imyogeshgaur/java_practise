package practise_set_9;

import java.util.Scanner;

class Sphere {
    private int radius;
    private int height;

    public void setRadius(int r) {
        radius = r;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sphere cy = new Sphere();
        System.out.printf("Set the Radius of the Cylinder : ");
        int Radius = sc.nextInt();
        System.out.printf("Enter the Height of the Cylinder : ");
        int Height = sc.nextInt();
        sc.close();
        cy.setHeight(Height);
        cy.setRadius(Radius);
        Radius = cy.getRadius();
        Height = cy.getHeight();
        System.out.printf("The Radius of the Cylinder is : %d \nThe Height of the Cylinder is : %d", Radius, Height);
    }
}

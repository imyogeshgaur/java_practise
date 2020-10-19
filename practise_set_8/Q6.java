package practise_set_8;

import java.util.Scanner;

class Circle {
    float radius;

    public void setRadius(float r) {
        radius = r;
    }

    public void getArea() {
        System.out.printf("The Area of the Circle is : %f", Math.PI * radius * radius);
    }

    public void getPerimeter() {
        System.out.printf("\nThe Perimeter of the Circle is : %f", 2 * Math.PI * radius);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle cir = new Circle();
        System.out.printf("Enter the Radius of the Circle : ");
        float Radius = sc.nextFloat();
        sc.close();
        cir.setRadius(Radius);
        cir.getArea();
        cir.getPerimeter();
    }
}

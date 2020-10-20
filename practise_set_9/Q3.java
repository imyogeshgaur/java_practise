package practise_set_9;

import java.util.Scanner;

class newnewCylinder {
    private int radius;
    private int height;

    public newnewCylinder(int r,int h){
         radius = r;
         height = h;
    }
    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
}
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Set the Radius of the Cylinder : ");
        int Radius = sc.nextInt();
        System.out.printf("Enter the Height of the Cylinder : ");
        int Height = sc.nextInt();
        sc.close();
        newnewCylinder nncy = new newnewCylinder(Radius,Height);
        Radius = nncy.getRadius();
        Height = nncy.getHeight();
        System.out.printf("The Radius of the Cylinder is : %d \nThe Height of the Cylinder is : %d", Radius, Height);
       
    }
}

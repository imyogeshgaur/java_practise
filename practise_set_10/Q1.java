package practise_set_10;


class Circle{
    float radius;
    Circle(float radius){
         this.radius = radius;
    }
    public void calcPerimeter(){
       System.out.printf("The Perimeter of the Circle is : ",2*Math.PI*this.radius);
    }
}

class Cyllinder extends Circle{
     float height;
     Cyllinder(float height ,float radius){
        super(radius);
        this.height = height;
        super.radius = radius;
     }  
}
public class Q1 {
    public static void main(String[] args) {
        
    }
}

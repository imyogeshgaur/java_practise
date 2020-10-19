package practise_set_7;

import java.util.Scanner;

public class Q9 {
static double convertCelsiusToFahrenheit(double c){
    double f = (c*1.8)+32;
    return f;
}
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.printf("Enter the Tempreature in Celcius : ");
      double Celcius = sc.nextDouble();
      sc.close();
      double Fahrenheit = convertCelsiusToFahrenheit(Celcius);
      System.out.printf("The tempreature is %f ",Fahrenheit);
 }   
}

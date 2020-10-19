package practise_set_7;

public class Q2 {
static void printPattern(){
    int i = 4;
    System.out.printf("The Pattern is : \n");
    while (i > 0) {
      for (int j = i; j <= 4; j++) {
          System.out.printf(" * ");
      }
      i--;
      System.out.println();
    }
}
    public static void main(String[] args) {
       printPattern(); 
    }
}

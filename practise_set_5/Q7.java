package practise_set_5;

public class Q7 {
    public static void main(String[] args) {
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
}

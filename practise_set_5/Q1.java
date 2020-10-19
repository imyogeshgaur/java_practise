package practise_set_5;

public class Q1 {
    public static void main(String[] args) {
        System.out.printf("The Pattern is : \n");
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j != i; j--) {
                System.out.printf(" * ");
            }
            System.out.println("");
        }
    }
}

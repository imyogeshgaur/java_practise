package practise_set_7;

public class Q4 {
static void printPattern(){
    System.out.printf("The Pattern is : \n");
    for (int i = 0; i < 4; i++) {
        for (int j = 4; j != i; j--) {
            System.out.printf(" * ");
        }
        System.out.println("");
    }
}
public static void main(String[] args) {
    printPattern();
}  
}

import java.util.Scanner;

public class RecursiveTest {
    public static void main(String[] args) {
        Scanner texter = new Scanner(System.in);
        System.out.print("What is the number you would like to recurse? ");
        int n = texter.nextInt();
        Recursive(n);

    }
    public static int Recursive(int n){
        if (n==1){ return 1;}
        else {
            System.out.println(n);
            return n * Recursive(n-1);
        }

    }
}

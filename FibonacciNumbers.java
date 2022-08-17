import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int n = obj.nextInt();
            int a = 1;
            int b = 1;
            int c = 0;
            for (a = 1; a <= n; a++) {
                System.out.print(c + " ");
                c = a + b;
                a = b;
                b = c;
            }
        }
    }
}
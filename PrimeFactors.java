import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            long n = obj.nextLong();
            int i = 2;
            while (n > 1) {
                if (n % i == 0) {
                    System.out.println(n + " ");
                    n /= i;
                } else {
                    i++;    
                }
            }
        }
    }
}

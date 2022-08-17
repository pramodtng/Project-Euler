import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int ans = 0;
            for (int i = 0; i < 1000; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    ans += i;
                }
            }
            System.out.println(ans);
        }
    }
}
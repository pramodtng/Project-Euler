
public class SumSquareDifference {
    public static void main(String[] args) {
        //sum of the squares of first 100 natural numbers
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        System.out.println(sum);

        //square of the sum of the first 100 natural numbers 
        int sum2 = 0;
        for(int i = 1; i <= 100; i++) {
            sum2 += i;
        }
        int square = sum2 * sum2;
        System.out.println(square);
        int finalSum = square - sum;
        System.out.println(finalSum);
    }
}

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(Sum(n));
    }

    private static int Sum(int n) {
        if (n < 10)
            return n;
        return n % 10 + Sum(n / 10);
    }
}

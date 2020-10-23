import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sum(n));
    }

    private static int sum(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return n + sum(n - 1);
    }
}

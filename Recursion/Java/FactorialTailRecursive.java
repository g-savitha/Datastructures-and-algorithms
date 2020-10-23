import java.util.Scanner;

public class FactorialTailRecursive {
    public static int fact(int n, int k) {
        if (n < 0)
            return -1;
        if (n == 0 || n == 1)
            return k;
        return fact(n - 1, n * k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n, 1));
    }

}

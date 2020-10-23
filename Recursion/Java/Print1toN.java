import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fn(n);
        tailRecursive(n, 1);
    }

    private static void tailRecursive(int n, int k) {
        if (n == 0)
            return;
        System.out.print(k + "");
        tailRecursive(n - 1, k + 1);
    }

    private static void fn(int n) {
        if (n == 0)
            return;
        fn(n - 1);
        System.out.println(n);
    }

}

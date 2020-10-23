import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fn(n);
    }

    // Tail recursion
    private static void fn(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        fn(n - 1);
    }
}

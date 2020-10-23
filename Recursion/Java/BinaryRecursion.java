/**
 * Recursion
 */
public class BinaryRecursion {
    static void fn(int n) {
        if (n == 0)
            return;
        fn(n / 2);
        System.out.println(n % 2);
    }

    public static void main(String[] args) {
        fn(20);
    }

}

import java.util.Scanner;

/**
 * CountDigits
 */
public class CountDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(countDigits(n));
    }

    // Method 1 -recursive
    // private static int countDigits(long n) {
    // if(n==0) return 0;
    // return 1+ countDigits(n/10)
    // }

    // Method 2 - iterative
    // private static int countDigits(long n) {
    // int count = 0;
    // while (n > 0) {
    // n /= 10;
    // count++;
    // }
    // return count;
    // }

    // Method 3 - logarithmic approach
    // private static long countDigits(long n) {
    // return (int) Math.floor(Math.log10(n) + 1);
    // }

    // Method 4 _ convert num to string and find string length
    private static int countDigits(long n) {
        String num = Long.toString(n);
        return num.length();
    }

}
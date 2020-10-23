import java.util.Scanner;

public class TowersOfHanoi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        TOH(n, "src", "aux", "dest");
    }

    private static void TOH(int n, String A, String B, String C) {
        if (n == 1) {
            System.out.println(" Move " + n + " from " + A + " to " + C);
            return;
        }
        TOH(n - 1, A, C, B);
        System.out.println(" Move " + n + " from " + A + " to " + C);
        TOH(n - 1, B, A, C);
    }
}

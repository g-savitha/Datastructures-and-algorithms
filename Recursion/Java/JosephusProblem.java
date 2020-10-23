
//problem desc : https://en.wikipedia.org/wiki/Josephus_problem
import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();

        System.out.println(josephous(n, k));
    }

    private static int josephous(int n, int k) {
        return josephousHelper(n, k) + 1;
    }

    private static int josephousHelper(int n, int k) {
        if (n == 1)
            return 0;
        else
            return (josephousHelper(n - 1, k) + k) % n;
    }
}

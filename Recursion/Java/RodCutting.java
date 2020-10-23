import java.util.Scanner;

//problem description : https://practice.geeksforgeeks.org/problems/rod-cutting/0

public class RodCutting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rodLength = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println(maxRodCuts(rodLength, a, b, c));
    }

    private static int maxRodCuts(int n, int a, int b, int c) {
        if (n == 0)
            return 0;
        if (n < 0)
            return -1;
        int res = Math.max(maxRodCuts(n - a, a, b, c),
                Math.max(maxRodCuts(n - b, a, b, c), maxRodCuts(n - c, a, b, c)));
        if (res == -1)
            return -1;
        return res + 1;
    }
}

import java.util.Scanner;

//problem desc : https://www.geeksforgeeks.org/subset-sum-problem-dp-25/

public class SubsetSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int sum = s.nextInt();
        System.out.println(countSubsets(arr, n, sum));
    }

    private static int countSubsets(int[] arr, int n, int sum) {
        if (n == 0)
            return sum == 0 ? 1 : 0;
        return countSubsets(arr, n - 1, sum) + countSubsets(arr, n - 1, sum - arr[n - 1]);
    }
}

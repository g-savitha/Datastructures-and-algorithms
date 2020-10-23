import java.util.Scanner;

public class StringPalindromeCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.println(palindromeCheck(str, 0, str.length() - 1));
    }

    private static boolean palindromeCheck(String str, int start, int end) {
        if (start >= end)
            return true;
        return ((str.charAt(start) == str.charAt(end)) && palindromeCheck(str, start + 1, end - 1));
    }
}
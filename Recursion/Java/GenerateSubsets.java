import java.util.Scanner;

//given a string print all of its subsets (No particular order is required)
public class GenerateSubsets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        subsets(str, "", 0);
    }

    private static void subsets(String str, String curr, int i) {
        if (i == str.length()) {
            System.out.print(curr + " ");
            return;
        }
        subsets(str, curr, i + 1);
        subsets(str, curr + str.charAt(i), i + 1);

    }
}

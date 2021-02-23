//find the index of largest element in a stream of numbers
public class LargestElementInAstream {
    public static void main(String[] args) {
        int[] a = {10,20,5,35,6,7};
        System.out.println(getLargest(a));
    }

	public static int getLargest(int[] a) {
        int res = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > a[res]) res = i;
        }
        return res;
	}
}

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
        int d = 2;
        leftRotateArrayByOne(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        leftRotateArrayByD(a,d, a.length);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    private static void reverse(int[] a, int low, int high) {
        while(low < high){
            int temp = 0;
            temp = a[low]; a[low] = a[high]; a[high] = temp;
            low++; high--;
        }
	}
	private static void leftRotateArrayByD(int[] a, int d, int n) {
        //naive approach -> Left rotateby 1 by d times
        // for(int i = 0; i < d; i++){
        //     leftRotateArrayByOne(a);
        // }
        // efficient approach -> reversal algorithm
        reverse(a,0,d-1);
        reverse(a,d,n-1);
        reverse(a,0,n-1);
	}

	private static void leftRotateArrayByOne(int[] a) {
        int first = a[0];
        for(int i = 1; i < a.length; i++){
            a[i-1] = a[i];
        }
        a[a.length - 1] = first;
	}
}

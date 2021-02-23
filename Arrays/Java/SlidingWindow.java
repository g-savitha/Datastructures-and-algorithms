public class SlidingWindow {
    
    public static int subArrSum(int[] a, int k){
        int sum = 0;
        //sum of first window
        for(int i = 0; i <k; i++){
            sum += a[i];
        }
        int max_sum = sum;
        //sum of remaining window
        for(int i = k; i <a.length; i++){
            sum += (a[i] - a[i-k]);
            max_sum = Math.max(max_sum,sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int[] a = {1,8,30,-5,20,7};
       System.out.println(subArrSum(a, 3)); 
    }
}
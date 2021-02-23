public class SecondLargestElementInAStream {
    public static void main(String[] args) {
        int[] a = {10,5,20,35,67,82,-1,0};
        System.out.println(secondLargestElementInAStream(a)); 
    }
    public static int secondLargestElementInAStream(int[] a){
        int res = -1;
        int largest = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > a[largest]){ 
                res = largest; largest = i;
            }
            else if(a[i] != a[largest]){
                if(res==-1||a[i]>res)res =i;
            }
        }
        return res;
    }
}

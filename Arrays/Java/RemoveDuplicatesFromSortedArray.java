// when duplicate elements are contigous
public class RemoveDuplicatesFromSortedArray {
 //without using an extra array 
 public static void main(String[] args) {
     int[] a = {10,20,20,20,30,30,10,40,30,30};
    int n =  removeDuplicatesFromSortedArray(a);
     for(int i = 0; i < n; i++){
         System.out.print(a[i] + " ");
     }
 }
 public static int removeDuplicatesFromSortedArray(int[] a){
     int res = 1;
     for(int i = 1; i < a.length; i++){
         if(a[i] != a[res-1]){
             a[res] = a[i];
             res++;
         }
     }
     return res;
 }   
}

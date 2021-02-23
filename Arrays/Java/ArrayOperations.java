public class ArrayOperations{
    static int insert(int arr[], int n, int x, int capacity, int position)
    {
        if(n == capacity) return n;
        
        int idx = position - 1;
        
    	for(int i = n - 1; i >= idx; i--){
    		arr[i + 1] = arr[i];
        }
        
    	arr[idx] = x;
    	return n + 1;
    } 
    static int search(int arr[], int n, int x)
    {
    	for(int i = 0; i < n; i++){
    		if(arr[i] == x)
    			return i;
    	}
    	return -1;
    } 
    static int delete(int arr[], int n, int x)
    {
    	int i = 0;
    	for(i = 0; i < n; i++) {
    		if(arr[i] == x)
    			break;
    	}
    	if(i == n) return n;

    	for(int j = i; j < n - 1; j++){
    		arr[j] = arr[j + 1];
    	}
    	return n-1;
	} 
	static boolean isSorted(int[] arr, int n){
		for(int i = 1; i <n; i++){
			if(arr[i] > arr[i-1]) return false;
		}
		return true;
	}
	static void reverse(int[] a, int n){
		int low = 0;
		int high = n- 1;
		int temp = 0;
		while(low < high){
			temp = a[low]; a[low] = a[high]; a[high] = temp;
			low++;
			high--;
		}
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]);
		}
	}
}
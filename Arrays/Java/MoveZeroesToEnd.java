public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] a = {8,5,0,10,0,20};
        moveZeroesToEnd(a);
    }
    static void moveZeroesToEnd(int[] a){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] != 0){
                int temp = 0;
                temp = a[i];
                a[i] = a[count];
                a[count] = temp;
                count++;
            }
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
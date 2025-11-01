// Sorting 
// Bubble Sort
import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr = {34,65,45,76,12};
        System.out.println(Arrays.toString(arr));
        int f = 1;
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    f = 1;
                    swap(arr, i, j);
                }
            }
            if(f == 0) break;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}

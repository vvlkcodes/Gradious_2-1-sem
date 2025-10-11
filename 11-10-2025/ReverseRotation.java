// Rotate the 1D array in anti clock wise direction. 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        int k = 2;
        for(int i=0;i<k;i++){
            int t = arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = t;
        }
        System.out.println("Rotated Array: ");
        System.out.println(Arrays.toString(arr));
        
	}
}

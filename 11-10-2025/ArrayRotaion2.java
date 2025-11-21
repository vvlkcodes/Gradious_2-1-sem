// Rotate the 1D array. 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        int k = 2;
        k = k%arr.length;
        int l = 0, r = arr.length-1;
        while(l<r){
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
        l = 0;
        r = k-1;
        while(l<r){
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
        l = k;
        r = arr.length-1;
        while(l<r){
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
        System.out.println("Rotated Array: ");
        System.out.println(Arrays.toString(arr));
        
	}
}

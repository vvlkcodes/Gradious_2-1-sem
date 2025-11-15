// Sorting 
// Bubble Sort
// Time complexity -> 
// Best -> O(1)
// Worst -> O(n^2)
// Space complexity -> O(1)

import java.util.*;
public class Main
{
	public static void main(String[] args) {
        int[] arr = {-1,3,2,4,1,56,0};
        System.out.println("The Unsorted Array: ");
        System.out.println(Arrays.toString(arr));    
        System.out.println("----------------------");
        bubbleSort(arr);
        System.out.println("The Sorted Array: ");
        System.out.println(Arrays.toString(arr));    
	}
	
	public static void bubbleSort(int[] arr){
	    for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]) swap(arr, i, j);
            }
        }
	}
	
	public static void swap(int[] arr, int i, int j){
	    int t = arr[i];
	    arr[i] = arr[j];
	    arr[j] = t;
	}
}

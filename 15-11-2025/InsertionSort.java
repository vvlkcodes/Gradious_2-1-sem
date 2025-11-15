// Sorting 
// Insertion Sort
// Time complexity -> 
// Best -> O(1)
// Worst -> O(n^2)
// Space complexity -> O(1)
// The number of swaps decreases in the selection sort and the number of comparisions remains the same

import java.util.*;
public class Main
{
	public static void main(String[] args) {
        int[] arr = {-1,3,2,4,1,56,0};
        System.out.println("The Unsorted Array: ");
        System.out.println(Arrays.toString(arr));    
        System.out.println("----------------------");
        insertionSort(arr);
        System.out.println("----------------------");
        System.out.println("The Sorted Array: ");
        System.out.println(Arrays.toString(arr));    
	}
	
	public static void insertionSort(int[] arr){
	    
	    for(int i=0;i<arr.length-1;i++){
	        int ti = i;
	        int j = i+1;
	        int lost = arr[j];
	        for(;ti >= 0 && lost < arr[ti];){
	            arr[ti + 1] = arr[ti];
	            ti--;
	        }
	        arr[ti + 1] = lost;
        }
	}
}

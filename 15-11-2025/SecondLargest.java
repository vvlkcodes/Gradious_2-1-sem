// Sorting
// Find the second largest element using the bubble sort 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
        int[] arr = {-1,3,2,4,1,56,0};
        System.out.println("The Unsorted Array: ");
        System.out.println(Arrays.toString(arr));    
        System.out.println("----------------------");
        bubbleSort1(arr);
        System.out.println("----------------------");
        System.out.println("The Array After Sorting 2 max elements using the bubble sort: ");
        System.out.println(Arrays.toString(arr));    
        int number = arr[arr.length-2];
        System.out.println("The second largest element is: "+number);
	}
	
	public static void bubbleSort1(int[] arr){
	    for(int i=arr.length-1;i>=arr.length-2;i--){
            for(int j=i-1;j>=0;j--){
                if(arr[i] < arr[j]) swap(arr, i, j);
            }
        }
	}
	
	public static void swap(int[] arr, int i, int j){
	    int t = arr[i];
	    arr[i] = arr[j];
	    arr[j] = t;
	}
}

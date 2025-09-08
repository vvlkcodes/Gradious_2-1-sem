// reversing an array and summing it with the original array's correspoinding indexes

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the number of elements: ");
	    int n = s.nextInt();
	    int[] arr = new int[n];
	    System.out.println("Enter the elements of array: ");
	    for(int i=0;i<n;i++){
	        arr[i] = s.nextInt();
	    }
	    int[] arr1 = Arrays.copyOf(arr, arr.length);
	    for(int i=0;i<arr.length/2;i++){
	        int temp = arr1[i];
	        arr1[i] = arr1[arr.length-i-1];
	        arr1[arr.length-i-1] = temp;
	    }
	    int[] arr2 = new int[arr.length];
	    System.out.println("The original array is: ");
	    System.out.println(Arrays.toString(arr));
	    System.out.println("The reversed array is: ");
	    System.out.println(Arrays.toString(arr1));
	    for(int i=0;i<arr.length;i++){
	        arr2[i] = arr[i] + arr1[i];
	    }
	    System.out.println("Final array after summing both the arrays with respect to the indexes: ");
	    System.out.println(Arrays.toString(arr2));
	}
}

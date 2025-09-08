// Create a new array which will have the values of the number of elements lesser than that of the current element respectively

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
	    int[] arr1 = new int[n];
	    int count;
	    for(int i=0;i<arr.length;i++){
	        count = 0;
	        for(int j = 0;j<arr.length;j++){
	            if(arr[i] > arr[j]) count++;
	            arr1[i] = count;
	        }
	    }
	    System.out.println(Arrays.toString(arr1));
	    
	}
}

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
	    for(int i=0;i<arr.length;i++){
	        System.out.print(arr[i] + arr[arr.length-i-1]+" ");
	    }
	}
}

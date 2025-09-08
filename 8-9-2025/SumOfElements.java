// sum of all the elements

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
	    int sum = 0;
	    for(int i=0;i<n;i++){
	        sum += arr[i];
	    }
	    System.out.println("The sum of the elements of the array is: ");
	    System.out.println(sum);
	}
}

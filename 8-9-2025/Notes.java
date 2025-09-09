8-9-2025
------------------------------------------------------------------------------------------------------------------------------
Inbuilt functions of arrays and a few important points:
int[] arr = {5,8,3,4,2};
1. For size of the array: 
	arr.length;
2. For acessing all the functions of the arrays:
	import java.util.Arrays;
3. For sorting the array which is given to you
	Arrays.sort(arr);
4. For printing the whole array without using the for loop again and again
	Arrays.toString(arr);
5. To copy an array into an other array:
	int[] arr1 = arr;
	--> but the above method is not efficient because it will effect the copied array every time we make any change in the actual array
6. To copy an array in an efficient way by using an inbuilt method
	int[] arr1 = Arrays.copyOf(arr,arr.length);
7. To copy a particular segment of the given array we have to make use of the inbuilt function below
	int[] arr1 = Arrays.copyOfRange(arr,1,4);
	here the elements copied will be from 1 to 3
8. When you just declare the array without initializing it with proper values, when you try to print the array, zeros
   will be  printed
9. When you want to fill a particular element in all the indexes of the array:
	Arrays.fill(arrayname, value); --> (Arrays.fill(arr, -1);)
10. To sort the given array in the descending order:
	there is no particular function for this but we can always use the logic of reversing an array by the help of swapping respective elements
	logic -->
		int[] arr = {5,5,6,7,2,3,1};
		Arrays.sort(arr);
		int n = arr.length;
		for(int i=0;i<arr.length/2;i++){
			int t = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = t;
		}
		System.out.println(Arrays.toString(arr));
11. If the given array is sorted and you want to check whether the particular value is available or not in the array we 	use:(to use this function, the array has to be sorted)
	Arrays.binarySearch(arr,x);
	if the element is found, the function returns a positive value
	or else it will return a negative value.
12. 
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
	    int[] arr1 = new int[100];
	    for(int i=0;i<arr.length;i++){
	        if(i == arr[i]) arr1[i]++;
	    }
	    
	   // int[] arr2 = new int
	   // int sum = 0;
	    for(int i=0;i<101;i++){
	        arr1[i] = arr[i] + arr[i-1];
	    }
	    System.out.println(Arrays.toString(arr1));
	    
	}
}
13. 

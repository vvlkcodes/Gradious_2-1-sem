// Product of Array Except Self Problem: Given an array nums of n integers,
// return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
// Example: Input: nums = [1,2,3,4] Output: [24,12,8,6]
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int[] arr = {1,2,3,4};
	    int[] res = new int[arr.length];
	    int prod;
	    for(int i=0;i<arr.length;i++){
	        prod = 1;
	        for(int j=0;j<arr.length;j++){
	            prod *= arr[j];
	        }
	        prod /= arr[i];
	        res[i] = prod;
	    }
	    System.out.println(Arrays.toString(res));
	}
}

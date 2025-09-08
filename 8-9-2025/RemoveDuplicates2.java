// remove the duplicates of the given array and print it's numbers in it's own order.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {6,7,7,5,6,3,4,2,3,5,2,1,1,1,2};
	    int[] res = new int[arr.length];
	    for(int i=0;i<arr.length;i++){
	        for(int j=i+1;j<arr.length;j++){
	            if(arr[i] == arr[j]) arr[j]=-1;
	        }
	    }
	    System.out.println(Arrays.toString(arr));
	    for(int i=0;i<arr.length;i++){
	        if(arr[i] != -1) System.out.print(" "+arr[i]);
	    }
	}
}

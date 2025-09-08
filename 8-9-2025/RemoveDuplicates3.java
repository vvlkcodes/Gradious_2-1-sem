// remove the duplicates of the given array and print it's numbers in it's own order.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {3,4,5,5,3,3,2,4,4,7,6,11};
	    int[] res = new int[arr.length];
	    int k = 0;
	    for(int i=0;i<arr.length;i++){
	        int f = 0;
	        for(int j=0;j<k;j++){
	            if(arr[i] == res[j]){
	                f=1;
	            }
	        }
	       if(f==0){
	           res[k] = arr[i];
	           k++;
	       }
	    }
	    for(int i=0;i<k;i++){
	        System.out.print(" "+res[i]);
	    }
	}
}

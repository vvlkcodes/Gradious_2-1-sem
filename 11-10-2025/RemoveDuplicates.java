// Removing the duplicates from the array

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int[] arr = {1,2,2,2,3,3,4};
		
		int[] res = new int[101];
		for(int i=0;i<arr.length;i++){
		    res[arr[i]]++;
		}
		int size = 0;
		for(int i=0;i<res.length;i++){
		    if(res[i] > 0) size++;
		}
		System.out.println(size);
		int[] result = new int[size];
		int k = -1;
		for(int i=0;i<res.length;i++){
		    if(res[i] > 0){
		        k++;
		        result[k] = i;
		    }
		}
		System.out.println(Arrays.toString(result));
	}
}

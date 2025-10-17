// Removing the duplicates from the array without changing the order of the array elements

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int[] arr = {4,5,3,4,3,2,6,7,7,8,4,3,2};
		
		int[] res = new int[arr.length];
		int k = 0;
		
		for(int i=0;i<arr.length;i++){
		    int flag = 0;
		    for(int j=0;j<k;j++){
		        if(arr[i] == res[j]){
		            flag = 1;
		            break;
		        }
		    }
		    if(flag == 0) res[k++] = arr[i];
		}
		System.out.println(Arrays.toString(Arrays.copyOfRange(res, 0 ,k)));
	}
}

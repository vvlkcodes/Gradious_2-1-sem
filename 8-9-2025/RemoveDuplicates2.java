// remove the duplicates of the given array and print it's numbers in it's own order.
// by hashing
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   // int[] arr = {6,7,7,5,6,3,4,2,3,5,2,1,1,1,2};
	    int[] arr = {3,4,5,5,3,3,2,4,4,7,6,11};
	    int[] res = new int[100];
	    for(int i=0;i<arr.length;i++){
	        res[arr[i]]++;
	    }
	   // System.out.println(Arrays.toString(arr));
	    for(int i=0;i<res.length;i++){
	        if(res[i] > 0) System.out.print(" "+i);
	    }
	}
}

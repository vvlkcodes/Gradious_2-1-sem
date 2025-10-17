// rotate array to 270 degrees
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[][] arr = {
	        {1,2,3},
	        {4,5,6},
	        {7,8,9}
	    };
	    System.out.println(Arrays.deepToString(arr));
	    for(int i=0;i<arr.length;i++){
	        int l = 0;
	        int r = arr.length-1;
	        while(l<r){
	            int t = arr[i][l];
	            arr[i][l] = arr[i][r];
	            arr[i][r] = t;
	            l++;
	            r--;
	        }
	    }
	    for(int i=0;i<arr.length;i++){
	        for(int j=0;j<i;j++){
	            int t = arr[i][j];
	            arr[i][j] = arr[j][i];
	            arr[j][i] = t;
	        }
	    }
	    
	    System.out.println(Arrays.deepToString(arr));
	}
}

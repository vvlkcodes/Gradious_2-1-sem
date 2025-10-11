// Rotate the 1D array. 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        int k = 2;
        for(int i=0;i<2;i++){
            int t = arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = t;
        }
        System.out.println(Arrays.toString(arr));
        
	}
}

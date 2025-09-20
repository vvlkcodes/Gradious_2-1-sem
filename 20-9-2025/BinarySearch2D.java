// 2D arrays
// Search for a value in the sorted 2D array.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = s.nextInt();
		System.out.println("Enter the number of columns: ");
		int m = s.nextInt();
		System.out.println("Enter the target element: ");
		int t = s.nextInt();
		int[][] arr = new int[n][m];
        System.out.println("Enter the elements: ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		System.out.println(BinarySearch(arr, t));
	}
	public static Boolean BinarySearch(int[][] arr, int n){
	    int i=0, j = arr[i].length-1;
	    while(i<arr[i].length && j>=0){
	        if(arr[i][j] == n) return true;
	        else if(arr[i][j] < n) i++;
	        else j--;
	    }
	    return false;
	}
	
}

// 1 2 3 
// 4 5 6
// 7 8 9

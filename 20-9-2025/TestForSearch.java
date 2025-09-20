// 2D arrays
// Taking the number of test cases and finding the given element's number in the matrix
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = s.nextInt();
		System.out.println("Enter the number of columns: ");
		int m = s.nextInt();
		System.out.println("Enter the number of test cases: ");
		int h = s.nextInt();
		int[][] arr = new int[n][m];
        System.out.println("Enter the elements: ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		int count = 0;
		while(count < h){
		    count++;
		    System.out.println("Enter the target: ");
		    int g = s.nextInt();
		    System.out.println(number(arr, g));
		    
		}
// 		System.out.println(Arrays.deepToString(arr));
	}
	public static int number(int[][] arr, int g){
	    int count = 1;
	    for(int i=0;i<arr.length;i++){
	        for(int j=0;j<arr[i].length;j++){
	            if(arr[i][j] == g) return count;
	            count++;
	        }
	    }
	    return -1;
	}
}

// 2D arrays
// Print the transpose of the given matrix
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = s.nextInt();
		System.out.println("Enter the number of columns: ");
		int m = s.nextInt();
		int[][] arr = new int[n][m];
        System.out.println("Enter the elements: ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = s.nextInt();
			}
		}
        System.out.println("The elements you entered are: ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(arr));
	}
}

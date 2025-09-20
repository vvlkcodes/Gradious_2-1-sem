// 2D arrays
// Find the sum of each columns.
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
        int count = 0;
        boolean flag = false;
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = s.nextInt();
                
            }
        }
        
        for(int i=0;i<n;i++){
            count = 0;
            for(int j=0;j<m;j++){
                count += arr[j][i];
            }System.out.println(count);
        }
        System.out.println(Arrays.deepToString(arr)); // This is to print the 2D array directly without the loops.
	}
}

// 2D arrays
// Search for the given value in the matrix
import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = s.nextInt();
        System.out.println("Enter the number of columns: ");
        int m = s.nextInt();
        System.out.println("Enter the target value;");
        int t = s.nextInt();
        int[][] arr = new int[n][m];
        int count = 0;
        boolean flag = false;
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = s.nextInt();
                if(arr[i][j] == t) flag = true;
            }
        }
        System.out.println(flag);
        if(flag) System.out.println("Found");
        else System.out.println("Not found");
        
        System.out.println(Arrays.deepToString(arr)); // This is to print the 2D array directly without the loops.
	}
}

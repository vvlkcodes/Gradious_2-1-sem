// 2D arrays
// count of the even numbers in the 2D array
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
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = s.nextInt();
                if(arr[i][j] % 2 == 0) count++;
            }
        }
        System.out.println("The count of the even numbers in the given matrix is: "+ count);
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }System.out.println();
        // }
        System.out.println(Arrays.deepToString(arr)); // This is to print the 2D array directly without the loops.
	}
}

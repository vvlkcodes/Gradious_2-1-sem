// 2D arrays.
// sum of the even numbers in the main Diagonal.
// count of the odd numbers in the right Diagonal.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number of rows: ");
        int n = s.nextInt();
        
        System.out.println("Enter the number of columns: ");
        int m = s.nextInt();
        
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("The sum of the even digits of the left Diagonal is: "+sumOfDiagonal(arr));
        System.out.println("The count of the odd numbers of the right Diagonal is: "+countOfDiagonal(arr));
    }
    public static int sumOfDiagonal(int[][] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==j && arr[i][j] % 2 == 0) sum += arr[i][j];
            }
        }
        return sum;
    }
    public static int countOfDiagonal(int[][] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==arr.length-j-1 && arr[i][j] % 2 != 0) sum++;
            }
        }
        return sum;
    }
}

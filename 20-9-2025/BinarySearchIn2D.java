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
        
        System.out.println("Enter the target element: ");
        int target = s.nextInt();
        
        boolean found = binarySearch2D(arr, target);
        System.out.println(found ? "Found" : "Not Found");
    }
    
    public static boolean binarySearch2D(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;
        
        int left = 0;
        int right = n * m - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / m;
            int col = mid % m;
            if (arr[row][col] == target) {
                return true;
            } else if (arr[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}

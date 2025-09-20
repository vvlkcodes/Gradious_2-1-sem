import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row and column of the array : ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		for(int i = 0; i<m; i++) {
			for(int j = 0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the number of inputs :");
		int w = sc.nextInt();
		int[] arr1 = new int[w];
		for(int i = 0; i<w; i++) {
			arr1[i] = sc.nextInt();
		}

		for(int i = 0; i<w; i++) {
			int p = arr1[i] % m ;
			int p1 = arr1[i]/n;
			System.out.print(arr[p1][p]);
		}

	}
}

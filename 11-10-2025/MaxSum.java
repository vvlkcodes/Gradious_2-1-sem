// Take the sum of the Diagonal, upper triangle and the lower triangle, and print the highest sum of all three.
// 4 x 4
// 3 1 1 3
// 4 9 1 2
// 2 1 8 3
// 4 2 6 9

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int[][] arr = {{3,1,1,3},{4,9,1,2},{2,1,8,3},{4,2,6,9}};
        int d = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i == j) d += arr[i][j];
            }
        }
        int u = 0;
        int l = 0;
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                u += arr[j][i];
                l += arr[i][j];
            }
        }
        System.out.println("Diagonal: "+d);
        System.out.println("Upper triangle: "+u);
        System.out.println("Lower triangle: "+l);
        if(d>u && d>l) System.out.println("Diagonal has the highest sum");
        else if(u>l) System.out.println("Upper triangle has the highest sum");
        else System.out.println("The Lower triangle has the highest sum");
	}
}

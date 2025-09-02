// Print the given Pattern
/*
55555
54445
54345
54445
55555
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the number: ");
	    int n = s.nextInt();
	    int m = n;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            if(i+j < n) System.out.print(n-Math.min(i,j));
	            else if(i+j >= n) System.out.print((Math.max(i,j)+1));
	        }System.out.println();
	    }
	    
	}
}

// Printing the fibunacci series using the for loop.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the number of terms: ");
	    int n = s.nextInt();
	    int a = 0;
	    int b = 1;
	    for(int i=0;i<=n;i++){
	        System.out.print(a+" ");
	        int sum = a+b;
	        a = b;
	        b = sum;
	    }
	    
	}
}

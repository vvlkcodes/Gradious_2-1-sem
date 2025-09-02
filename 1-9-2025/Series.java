// Print the given series
// 3 6 30 870.... up to n terms
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the number: ");
	    int n = s.nextInt();
	    System.out.print(n);
	    for(int i=0;i<n;i++){
	        int result = (n*n) - n;
	        System.out.print(","+result);
	        n = result;
	    }
	    
	}
}

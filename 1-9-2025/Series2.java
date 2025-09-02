// Print the given series
// 3,7,15,31,63.... up to n terms
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the number: ");
	    int n = s.nextInt();
	    System.out.print(n);
	    for(int i=0;i<n;i++){
	        n = (n*2) + 1;
	        System.out.print(","+n);
	    }
	    
	}
}

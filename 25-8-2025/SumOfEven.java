/*
take the input and print the sum of all the even digits of the number
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            if(rem % 2 == 0) sum += rem;
            n /= 10;
        }
        System.out.println(sum);
        
	}
}

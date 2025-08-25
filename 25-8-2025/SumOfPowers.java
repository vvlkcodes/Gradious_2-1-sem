/*
print the sum of the powers of the individual digits of the given number from last digit starting from 1
example : 
123
1^3 + 2^2 + 3^1 = 8
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        int value = 1;
        while(n>0){
            double rem = Math.pow((n%10),value);
            value++;
            sum += rem;
            n /= 10;
        }
        System.out.println(sum);
        
	}
}

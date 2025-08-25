/*
1
22
333
4444
55555
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long m = 0;
        for(int i=1;i<=n;i++){
            m = m*(10*i)+i;
            System.out.println(m);
            m /= i;
        }
	}
}

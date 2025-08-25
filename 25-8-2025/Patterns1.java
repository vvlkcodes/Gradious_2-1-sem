/*
1
22
333
4444
55555
4444
333
22
1
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }System.out.println();
        }
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }System.out.println();
        }
	}
}

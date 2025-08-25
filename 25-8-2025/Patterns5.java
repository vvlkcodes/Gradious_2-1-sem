/*
_____1_____
____1 2____
___1 2 3___
__1 2 3 4__
_1 2 3 4 5_
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = s.nextInt();
        for(int i=n;i>=1;i--){
            System.out.print("_");
            for(int j=2;j<=i;j++){
                System.out.print("_");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
                if(j != n-i+1) System.out.print("_");
            }
            for(int j=2;j<=i;j++){
                System.out.print("_");
            }
            System.out.print("_");
            if(i!=1) System.out.println();
        }
        
	}
}

/*
____1____
___1 2___
__1 2 3__
_1 2 3 4_
1 2 3 4 5
*/


import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = s.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=2;j<=i;j++){
                System.out.print("_");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
                if(j != n-i+1) System.out.print(" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print("_");
            }
            if(i!=1) System.out.println();
        }
        
	}
}

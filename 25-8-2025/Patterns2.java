/*
    *
   * *
  * * *
 * * * * 
* * * * *
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
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            if(i!=1) System.out.println();
        }
        
        
	}
}

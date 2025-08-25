/*
abcdedcba
 abcdcba
  abcba
   aba
    a
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = s.nextInt();
        for(int i=n;i>0;i--){
            //Spaces
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            // ab ->
            for(int j=97;j<97+i;j++){
                System.out.print((char)j);
            }
            // ba<-
            for(int j=97+i-2;j>=97;j--){
                System.out.print((char)j);
            }
            System.out.println();
        }
        
	}
}

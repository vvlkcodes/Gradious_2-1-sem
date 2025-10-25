// Printing the number of the character according to the alphabetical order from the given string
import java.util.*;
public class Main
{
	public static void main(String[] args) {
    	String str="azbxcy";
    	 int[] arr=new int[str.length()];
    	 
    	
    	 for(int i=0;i<str.length();i++){
    	     char ch=str.charAt(i);
    	     int a=ch;
    	     arr[i]=ch-'a'+1;
    	      
    	 }
    	 System.out.print(Arrays.toString(arr));
    	    
	}
}

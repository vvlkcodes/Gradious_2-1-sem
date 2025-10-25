// Frequency of each character
import java.util.*;
public class Main
{
	public static void main(String[] args) {
    	String str="aaabbaaaaddddcbbb";
	    String str1="";
	        int count=1;
	       for(int j=0;j<str.length()-1;j++){
	           if (str.charAt(j)==str.charAt(j+1)){
	               count++;
	           }
	           else{
	               str1=str1+str.charAt(j)+count;
	               count=1;
	           }
	       }
	           str1=str1+str.charAt(str.length()-1)+count;
	   	System.out.println(str1);
	}
}

// To invert the alphabets
// Ex: a --> z, b --> y ...so on and vice versa
import java.util.*;
public class Main
{
	public static void main(String[] args) {
    	int[] arr1={14,15,16,17,18,19,20,21,22,23,24,25,26};
	    String str="hgfwvmg";
	    int res=0;
	    for(int i=0;i<str.length();i++){
	        System.out.print((char)(('a'+'z')-str.charAt(i)));
	    } 
	}
}

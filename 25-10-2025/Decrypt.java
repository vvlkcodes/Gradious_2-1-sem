// Decryption, changing the letter by shifting it to the left by 4
import java.util.*;
public class Main
{
	public static void main(String[] args) {
    	String str="bvec";
	    int k=4;
	    for(int i=0;i<str.length();i++){
	        if (str.charAt(i)-k>=97)
	        System.out.print((char)(str.charAt(i)-k));
	        else
	        System.out.print((char)(str.charAt(i)-k+26));
	    }
	}
}

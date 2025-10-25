// Print the upper case followed by lower case and the digits from the given string
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String str="fgsRTsdf3gg2fsd4r53";
	    StringBuilder sb=new StringBuilder();
	    int upperCount=0;int lowerCount=0;int digit=0;
	    for(int i=0;i<str.length();i++){
	        char s=str.charAt(i);
	       if (Character.isUpperCase(str.charAt(i))){
	           sb.append(str.charAt(i));
	       }
	    }
	    for(int i=0;i<str.length();i++){
	        if (Character.isLowerCase(str.charAt(i)))
	        sb.append(str.charAt(i));
	    }
	    for(int i=0;i<str.length();i++){
	        if (Character.isLowerCase(str.charAt(i)))
	        continue;
	        else if (Character.isUpperCase(str.charAt(i)))
	        continue;
	        else sb.append(str.charAt(i));
	    }
	   String str1=sb.toString();
	   for(int i=0;i<str1.length();i++)
	   System.out.print(str1.charAt(i)+" ");
	}
}

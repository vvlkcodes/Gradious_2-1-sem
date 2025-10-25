// Finding the count of the upper lower cases and the digits
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int u=0;int l=0;int d=0;
	  String str="rfgtRED2345";
	  for(int i=0;i<str.length();i++){
	      char ch=str.charAt(i);
	      if (ch>=65&&ch>=95)
	      u++;
	      else if (ch>=97&&ch<=122)
	      l++;
	      else
	      d++;
	  }
	  System.out.print("Upper case: "+u+" Lower case: "+l+" Digits: "+d);
	}
}

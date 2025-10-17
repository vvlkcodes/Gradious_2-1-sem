// Strings
// Strings are immutable.

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		String str = "Rohann";
		String str1 = new String("Rohann");
		// Length
		System.out.println(str);
		System.out.println(str.length());
		// access a specific character by using the index
		System.out.println(str.charAt(2));
		// To find the index of the chacater in the String
		// The below function will give the index of the first occuring of the given character
		System.out.println(str.indexOf("h"));
		// for the occurance of the word's first letter
		System.out.println(str.indexOf("oh"));
		// To check the last occurance of the character in the String
		System.out.println(str.lastIndexOf("n"));
		// To replace a character in the String
		// This will just return a new string in which the character is replaced, so the actual string will not get changed.
		System.out.println(str.replace("R", "p"));
		System.out.println(str);
		// To change the string to upper case :
		System.out.println(str.toUpperCase());
		// To change the string to the lower case
		System.out.println(str.toLowerCase());
		// To check if 2 strings are equal or not
		String s1 = "hello";
		String s2 = "HELLO";
		System.out.println(s1.equals(s2));
		// To check if the strings are equal after ignoring the upper or lower cases
		System.out.println(s1.equalsIgnoreCase(s2));
		String s3 = "       hi         ";
		System.out.println(s3);
		// To remove the spaces in the front and back of the String
		System.out.println(s3.trim());
		// 
		String s4 = "hey all, how are you?";
		System.out.println(Arrays.toString(s4.split(" ")));
		System.out.println(Arrays.toString(s4.split("a")));
		
		
		
	}
}

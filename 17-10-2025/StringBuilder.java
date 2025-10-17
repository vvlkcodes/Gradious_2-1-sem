// StringBuilder
// StringBuilders are mutable and fast

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Rohann");
        System.out.println(str);		
        // To add or append the characters or string into the original string
		System.out.println(str.append("123"));
		System.out.println(str);
		// To insert the elements or strings in the original string
		str.insert(5, "abc");
		System.out.println(str);
		
	}
}

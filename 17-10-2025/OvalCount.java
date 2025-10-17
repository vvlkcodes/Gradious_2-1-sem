// count of the ovals in the given string

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
		String str = s.nextLine();
		String string = str.toLowerCase();
		int count = 0;
        StringBuilder str1 = new StringBuilder(str);
        for(int i=0;i<str.length();i++){
            char ch = string.charAt(i);
            if(ch == 'o' || ch == 'i' || ch == 'e' || ch == 'a' || ch == 'u') count++;
        }
        System.out.println(count);
    }
}

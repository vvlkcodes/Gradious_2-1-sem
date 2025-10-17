// Given a string with upper lower cases, digits, special character --> Print the count of alphabets, digits and string special character
import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string of your choice: ");
        String str = sc.nextLine();
        int u = 0;
        int l = 0;
        int d = 0;
        int s = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 65 && ch <= 90) u++;
            else if(ch >= 97 && ch <= 122) l++;
            else if(ch >= '0' && ch <= '9');
            else s++;
        }
        System.out.println("Number of lower case characters: "+l+"\number of upper case characters: "+u+"\nNumber of special characters: "+s);
	}
}

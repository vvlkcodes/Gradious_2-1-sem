// Print count of upper case and lower case char in the string
import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string of your choice: ");
        String str = s.nextLine();
        int u = 0;
        int l = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 65 && ch <= 90) u++;
            else if(ch >= 97 && ch <= 122) l++;
        }
        System.out.println("Lower case: "+ l+"\nUpper case: "+u);
	}
}

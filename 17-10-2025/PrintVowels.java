// Print all the vowels of the given string
import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string of your choice: ");
        String str = s.nextLine();
        String b = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') b += ch+" ";
        }
        System.out.println(b);
	}
}

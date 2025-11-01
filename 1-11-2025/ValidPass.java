// Advance Strings.
// Check the given password and display the number of minimum characters that are to be added to make it VALID
// Also print if it is valid or invalid
// upper
// lower
// specials 
// length 
// digit
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "123";
        // String str = "1234567";
        // String str = "Qwertyui";
        // String str = "Abc$aw";
        // String str = "Ab@2";
        
        int c = 0;
        boolean u = false;
        boolean l = false;
        boolean d = false;
        boolean s = false;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)) u = true;
            else if(Character.isLowerCase(ch)) l = true;
            else if(Character.isDigit(ch)) d = true;
            else{
                s = true;
            }
        }
            if(s == false) c++;
            if(u == false) c++;
            if(l == false) c++;
            if(d == false) c++;
            int res = Math.max(c, 8 - str.length());
            System.out.println(res);
            if(s && u  && l  && d  && str.length() >=8) System.out.println("VALID");
            else System.out.println("INVALID");
    }
}

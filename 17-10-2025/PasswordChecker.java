// Password checker(atleast one upper, atleast one lower, one digit, one special, length >= 8)	
import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Password: ");
        String str = sc.nextLine();
        boolean q = false;
        boolean w = false;
        boolean e = false;
        boolean r = false;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 65 && ch <= 90) q = true;
            else if(ch >= 97 && ch <= 122) w = true;
            else if(ch >= '0' && ch <= '9') e = true;
            else r = true;
        }
        if(q && w && e && r && str.length() >= 8) System.out.println("Valid Password");
        else System.out.println("Invalid Password");
        
	}
}

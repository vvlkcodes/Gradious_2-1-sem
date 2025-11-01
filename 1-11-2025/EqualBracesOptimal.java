// Advanced Strings.
// Find the value index of the string where the number of open braces of the left side is equal to the number of closed braces right side 
public class Main
{
	public static void main(String[] args) {
        String str = "))((";
        // String str = "(())(())()";
        // String str = "))))))()(((";
        int oc = 0;
        int cc = 0;
        int ans = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ')') cc++;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(') oc++;
            else if(ch == ')') cc--;
            if(oc == cc) ans = i+1;
        }
        System.out.println(ans);
	}
}

// Advanced Strings.
// Find the value index of the string where the number of open braces of the left side is equal to the number of closed braces right side 
public class Main
{
	public static void main(String[] args) {
        String str = "()()()())(";
        int k = 0;
        int res = 0;
        while(k < str.length()){
            int open = 0;
            int close = 0;
            for(int i =0;i<k;i++){
                char ch = str.charAt(i);
                if(ch == '('){
                    open++;
                }
            }
            for(int i=k;i<str.length();i++){
                char ch = str.charAt(i);
                if(ch == ')') close++;
            }
            if(open == close){
                res = k;
                break;
            }else{
                k++;
            }
        }
        System.out.println(res);
	}
}

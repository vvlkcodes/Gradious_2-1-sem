// Advance Strings.
// reverse the string with out changing the position of the special characters
import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "h$ell@o#";
        System.out.println(str);
        char[] arr = str.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(!(Character.isLetter(arr[i]))){
                i++;
            }
            if(!(Character.isLetter(arr[j]))){
                j--;
            }else{
                char t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }
        }
        String res = "";
        for(int l=0;l<arr.length;l++){
            res += arr[l];
        }
        // System.out.println(Arrays.toString(arr));
        System.out.println(res);
	}
}

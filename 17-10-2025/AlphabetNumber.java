// Input --> "azcbye" --> output: [1,26,3,2,25,5]
import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string of your choice: ");
        String str = sc.nextLine();
        int[] arr = new int[str.length()];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int n = -(122 - 26 - ch);
            arr[i] = n;
        }
        System.out.println(Arrays.toString(arr));
	}
}

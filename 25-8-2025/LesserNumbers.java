/*
Print the total number of digits less than each number in the given array
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = s.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = s.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[i] > arr[j]) count++;
            }
            arr1[i] = count;
        }
        System.out.println(Arrays.toString(arr1));
	}
}

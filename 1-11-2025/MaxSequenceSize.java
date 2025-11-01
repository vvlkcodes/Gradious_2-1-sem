// Advance Strings.
// Find the length of the longest substring in the given string which is in proper alphabetical order

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // String str = "sdabcdeghijruvwxyzpqrstabc";
        // String str = "hijklmnop";
        String str = "baxzqpwvu";
        
        
        int count = 1;
        int[] arr = new int[30];
        int k = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<str.length()-1;i++){
            char c = str.charAt(i);
            char h = str.charAt(i+1);
            if(c < h && ((int)h - (int)c == 1)){
                count++;
            }else{
                count = 1;
            }
            max = Math.max(max, count); 
        }
        System.out.println(max);
    }
}

// Check if the guven year is a leap year or not.
// is 1986 a leap year or not
// Century years are never the leap years except the Century years that occurs once after 400 years.


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = s.nextInt();
        if(year%400 == 0 || (year%4 == 0 && year%100 != 0)){
            System.out.println("Leap");
        }else{
            System.out.println("No");
        }
    }
}

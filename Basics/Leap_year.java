// Check if the guven year is a leap year or not.
// is 1986 a leap year or not
// Century years are never the leap years except the Century years that occurs once after 400 years.

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int n = s.nextInt();
		if(n%4==0 && n%400==0 || n%100!=0) System.out.println("Leap");
		else System.out.println("Not a Leap Year");
		System.out.println(1986/400);
	}
}

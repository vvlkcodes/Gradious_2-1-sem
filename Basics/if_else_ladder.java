import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = s.nextInt();
		if(n>=1 && n<=25){
		    if(n%2==0) System.out.println(n*2);
		    else System.out.println(n/2);
		}else if(n>=26 && n<=50){
		    if(n%2==0) System.out.println(n/2);
		    else System.out.println(n*2);
		}else if(n>=51 && n<=75){
		    if(n%2==0) System.out.println(n*2);
		    else System.out.println(n/2);
		}else if(n>=26 && n<=50){
		    if(n%2==0) System.out.println(n/2);
		    else System.out.println(n*2);
		}else System.out.println(n+1000);
		
	}
}

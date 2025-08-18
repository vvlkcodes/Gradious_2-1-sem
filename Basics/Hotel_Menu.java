//Baisc switch case program to calculate the price of the selected items from the given menu
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Welcome to ACE Restaurant...");
	    System.out.println("Hi please, Enter your name: ");
	    String name = s.nextLine();
	    System.out.println("Hey "+name+",");
	    System.out.println("1.Dal fry: 40rs\n2.Panner butter masala: 100rs\n3.Chicken curry: 120rs\n4.Fish fry: 100rs\n5.Tomato curry: 30rs\nSelect from the menu: ");
	    System.out.println("Select from the menu: ");
	    int n = s.nextInt();
	    System.out.println("Enter the quantity you need: ");
	    int m = s.nextInt();
	    int check = 0;
	    switch(n){
	        case 1:
	            System.out.println("You selected Dal fry, please pay: "+(40*m));
	            check = 40*m;
	            break;
	        case 2:
	            System.out.println("You selected Panner butter masala, please pay: "+(100*m));
	            check = 100*m;
	            break;
	        case 3:
	            System.out.println("You selected Chicken curry, please pay: "+(120*m));
	            check = 120*m;
	            break;
	        case 4:
	            System.out.println("You selected Fish fry, please pay: "+(100*m));
	            check = 100*m;
	            break;
	        case 5:
	            System.out.println("You selected Tomato curry, please pay: "+(30*m));
	            check = 30*m;
	            break;
	        default:
	            System.out.println("Invalid");
	    }
	    int checking = s.nextInt();
	    if(check == checking) System.out.println("Order placed, please kindly wait");
	    else System.out.println("Plase pay the correct amount");
	}
}

//Baisc switch case program to calculate the price of the selected items from the given menu
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("---Welcome to ACE Restaurant---");
	    System.out.println("---Hi please, Enter your name: ");
	    String name = s.nextLine();
	    System.out.println("Hey "+name+",");
	    int check = 0;
	    char ch = 'y';
	    int price = 0;
	    String str = "";
	    while(ch == 'y'){
	        	System.out.println("1.Dal fry: 40rs\n2.Panner butter masala: 100rs\n3.Chicken curry: 120rs\n4.Fish fry: 100rs\n5.Tomato curry: 30rs\nSelect from the menu: ");
                int n = s.nextInt();
                System.out.println("Enter the quantity you need: ");
	            int m = s.nextInt();
    	        switch(n){
    	        case 1:
    	            str += "Dal fry,";
    	            check = 40*m; break;
    	        case 2:
    	            str += "Panner butter masala,";
    	            check = 100*m;
    	            break;
    	        case 3:
    	            str += "Chicken curry,";
    	            check = 120*m;
    	            break;
    	        case 4:
    	            str += "Fish fry";
    	            check = 100*m;
    	            break;
    	        case 5:
    	            str += "Tomato curry";
    	            check = 30*m;
    	            break;
    	        default:
    	            System.out.println("Invalid");
    	    }
    	    price+=check;
    	    System.out.println("The items you've selected are: "+str);
    	    System.out.println("The total amount you've to pay is: "+price);
    	    System.out.println("Do you want to order anything more(y/n): ");
    	    ch = s.next().charAt(0); 

    	    
	    }
	    System.out.println("Please pay the amount.");
	    int checking = s.nextInt();
	    if(price == checking) System.out.println("Order placed, please kindly wait");
	    else System.out.println("Plase pay the correct amount");
	}
}

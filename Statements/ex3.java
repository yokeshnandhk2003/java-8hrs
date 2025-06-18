//Get a input from user,for the variable called RCB.
//If RCB == Win Print("Ee sala cup Namdhey")
//If RCB == loose Print("cup illa")
package Statements;
import java.util.Scanner;
public class ex3 {
	public static void main (String args[])
	{
		Scanner scan = new Scanner(System.in);
		String RCB=scan.nextLine();
		
		if (RCB.equals("win"))
		{
			System.out.print("Ee sala cup Namadhe");
		}
		else {
			System.out.print("cup illa");
		}
			
			
		
	}

}

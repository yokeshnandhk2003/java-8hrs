package Statements;
//get input from the user
//We have two numbers
//num1 = 40
//num2 = 50
//check whether two number is equal or not.
import java.util.Scanner;
public class ex2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num1= scan.nextInt();
		int num2= scan.nextInt();
		if(num1==num2)
		{
			System.out.println("Both the numbers are equal");
			
		}
		else {
			System.out.println("Not equal"); 
		}
		
	}

}

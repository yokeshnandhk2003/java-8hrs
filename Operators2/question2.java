package Operators2;
//Get input for two integer number and find which number is greater using ternary operator?
import java.util.Scanner;
public class question2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = scan.nextInt();
		System.out.println("Enter second number:");
		int b = scan.nextInt();
		
		int num=(a>b)?a:b;
		System.out.print("greater number: "+num );
		
	 

	}

}

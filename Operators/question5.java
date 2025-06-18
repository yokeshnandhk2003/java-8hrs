package Operators;
import java.util.Scanner;
public class question5 {
//	Get input for a number and find it is even or odd number?
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num%2==0) {
			System.out.print("It is even number");
		}
		else {
			System.out.print("It is odd number");
		}
		
	}

}

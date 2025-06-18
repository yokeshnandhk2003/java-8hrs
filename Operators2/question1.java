package Operators2;
import java.util.Scanner;
public class question1 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your salary:");
		int salary = scan.nextInt();
		System.out.println("Enter your age:");   
		int age = scan.nextInt();
		   
		if(salary>=20000 ||age<=25) {
	    System.out.println("Eligible for loan");
	    System.out.println("How much loan you need?");
		int loan=scan.nextInt();
		if(loan<=50000) {
			System.out.println("You are eligible for loan");
		}
		else {
			System.out.println("Loan not available");
		}
		}
		else {
			System.out.print("No loan");
		}
	
	}

}

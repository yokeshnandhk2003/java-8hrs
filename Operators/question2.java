//Get input for variable income.if income is greater than 7000 scholarship is available.Else not eligible for scholarship.
package Operators;
import java.util.Scanner;
public class question2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int Scholarship = scan.nextInt ();
		if(Scholarship>6999) {
			System.out.print("Scholarship is eligible");
		}
		else {
			System.out.print("Not eligible for scholarship");
		}
		
		
	}

}

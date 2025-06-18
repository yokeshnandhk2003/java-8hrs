//Get input for variables Mark.if mark>35 print pass.Else Print fail.
package Operators;
import java.util.Scanner;
public class question1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Mark = scan.nextInt();
		if(Mark>34) {
			System.out.print("pass");
		}
		else {
			System.out.print("fail");
		}

	}

}
